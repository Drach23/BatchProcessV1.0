
package logic;
import logic.DataBank.OperationData;

/**
 * clase unicamente para probar que todos los datos se generaran bien.
 * @author Aquino
 */
public class DataBankTester {
public static void main(String[] args) {
        // Generar datos aleatorios de operación
        DoubleEnlacedList processList = new DoubleEnlacedList();

        DataBank.OperationData operationData = DataBank.generateRandomOperation();
        double num1 = operationData.num1;
        double num2 = operationData.num2;
        String operator = operationData.operation;
        
         double result = DataBank.resolveOperation(num1, num2, operator);

        // Crear un nuevo proceso
        int id = 1; 
        String name = "Test"; 
        int tme = 10; 
        Process newProcess = new Process(id, name, tme, operator, num1, num2, result);
        processList.addToEnd(newProcess);
        processList.show();

        // Resolver la operación y obtener el resultado
       

    }
 }
