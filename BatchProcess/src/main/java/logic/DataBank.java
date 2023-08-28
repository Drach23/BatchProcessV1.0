
package logic;
import java.util.Random;

public class DataBank {
    private static final String[] NAMES ={"Diego","Claudia","Memo","Alexis"
            ,"Luis","Brise","Carlos","Avila","Jose","Karla","Paulina","Mariana"
    ,"tonatiuh","Paola","Erick","Maggie","Leslie","Fernanda","Tony","Alfred"
    ,"Gonzalo"};
    
    
    
    public static String generateRandomName() {
        Random random = new Random();
        int index = random.nextInt(NAMES.length);
        return NAMES[index];
    }
    /**
     * esta clase nos ayuda a generar una operacion random, la cual se define con dos numeros random
     * un numero el cual entra a un switch y este define la operacion
     * @return 
     */
    public static String generateRandomOperation() {
    Random random = new Random();
    double num1 = random.nextInt(100);
    double num2 = random.nextInt(100);
    int operationCode = random.nextInt(4);  // Genera un número aleatorio entre 0 y 3
    String operationSymbol = "";
    
    if (num2 == 0 && operationCode == 3) {
        return generateRandomOperation(); // Genera una nueva operación si hay división por cero
    }

    switch (operationCode) {
        case 0:
            operationSymbol = "+";
            break;
        case 1:
            operationSymbol = "-";
            break;
        case 2:
            operationSymbol = "*";
            break;
        case 3:
            operationSymbol = "/";
            // Validación para evitar división entre 0
            while (num2 == 0) {
                num2 = random.nextInt(100);
            }
            break;
    }

        double result = resolveOperation(num1, num2, operationSymbol);
        String formattedResult = String.format("%.2f", result); // Limita a 2 decimales
        String operation = num1 + " " + operationSymbol + " " + num2;
        return operation;
}

private static double resolveOperation(double num1, double num2, String operationSymbol) {
    switch (operationSymbol) {
        case "+":
            return num1 + num2;
        case "-":
            return num1 - num2;
        case "*":
            return num1 * num2;
        case "/":
            return num1 / num2;
        default:
            throw new IllegalArgumentException("Simbolo de operacion invalido");
    }
}
public static int generateRandomTme() {
    Random random = new Random();
        int tme = random.nextInt(8) + 5; // Genera un número entre 1 y 12 (inclusive)

        // Asegura que el valor generado no sea menor de 5
        if (tme < 5) {
            tme = 5;
        }

        return tme;
    }
}

