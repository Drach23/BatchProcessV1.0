package logic;
/**
 * Clase para definir cada uno de los procesos que se generaran
 * con esto definimos sus Atributos, su constructor, setters y getters
 * @author Aquino
 */
public class Process {
  private int id,tme;
    private String name, operation;
    private double result;
    private double num1;
    private double num2;
    
    
    public Process(int id,String name, int tme, String operation,double num1, double num2,double result){
        this.id = id;
        this.name = name;
        this.tme = tme;
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        
    }
    
    public void reduceTME(){
        tme--;
    }
    
    public String getName() {
        return name;
    }
    public String getOperation(){
        return operation;
    }
    public int getId(){
        return id;
    }
    public int getTme(){
        return tme;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTme(int tme){
        this.tme = tme;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }
    
    public String getConcatenatedOperation() {
        return num1 + " " + operation + " " + num2;
    }
    
    public double calculateResult() {
        return result;
    }
         public void setNum1(double num1){
     this.num1 = num1;
     }
     public double getNum1(){
     return num1;
     }
     public void setNum2(double num2){
     this.num2 = num2;
     }
     public double getNum2(){
     return num2;
     }
    
     public void setResult(double result){
        this.result = result;
    }
     public double getResult(){
        return result;
    }

    
   
}
