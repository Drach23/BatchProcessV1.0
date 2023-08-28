package logic;
public class Process {
  private int id,tme;
    private String name, operation;
    
    
    public Process(int id,String name, int tme, String operation){
        this.id = id;
        this.name = name;
        this.tme = tme;
        this.operation = operation;
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
   
}
