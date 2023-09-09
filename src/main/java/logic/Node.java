
package logic;
//Creacin de mi nodo para lista doblemente enlazada.
public class Node {
    public Process process;
    public Node prev;
    public Node next;
    
    public Process getProcess(){
        return this.process;
    }
    
    public Node(Process process){
    this.process = process;
  }
}
