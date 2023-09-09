package logic;
import java.util.Random;

/**
 * banco de datos aleatorios para alimentar el programa
 * primero tenemos un arreglo con los nombres que quiero tener
 * generateRandomName recorre todo el arreglo con un index el cual devuelve todo por donde pasa
 * operationData es una clase necesaria para poder usar generateRandomOperation
 * generateRandoOperation genera una operacion random la cual se almacena en operation adicional a dos numeros random num1, num2
 * luego generateRandomOp lo que hace es generar un numero aleatorio entre 0-3 y con eso se decide el switch para saber la operacion
 * ResolveOperation trabaja en conjunto con generateRandomOp y soluciona la operacion
 * por ultimo tenemos generateRandomTme el cual nos da un tiempo maximo esperado con el que haremos cuenta regresiva.
 * @author Drach
 */
public class DataBank {
    private static final String[] NAMES = {"Diego", "Claudia", "Memo", "Alexis",
            "Luis", "Brise", "Carlos", "Avila", "Jose", "Karla", "Paulina", "Mariana",
            "tonatiuh", "Paola", "Erick", "Maggie", "Leslie", "Fernanda", "Tony", "Alfred",
            "Gonzalo"};

    public static String generateRandomName() {
        Random random = new Random();
        int index = random.nextInt(NAMES.length);
        return NAMES[index];
    }

    public static class OperationData {
    public double num1;
    public double num2;
    public String operation;

    public OperationData(double num1, double num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
}

public static OperationData generateRandomOperation() {
    Random random = new Random();
    double num1 = random.nextInt(100);
    double num2 = random.nextInt(100);
    int operationCode = random.nextInt(4);  // Genera un número aleatorio entre 0 y 3
    String operationSymbol = "";

    if (num2 == 0 && operationCode == 3) {
        return generateRandomOperation();
    }

    switch (operationCode) {
        case 0 -> operationSymbol = "+";
        case 1 -> operationSymbol = "-";
        case 2 -> operationSymbol = "*";
        case 3 -> {
            operationSymbol = "/";
            while (num2 == 0) {
                num2 = random.nextInt(100);
            }
            }
    }

    return new OperationData(num1, num2, operationSymbol);
}


    public static double resolveOperation(double num1, double num2, String operationSymbol) {
        switch (operationSymbol) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" -> {
                return num1 / num2;
            }
            default -> throw new IllegalArgumentException("Simbolo de operacion invalido");
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
