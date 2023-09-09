package logic;
/**
 * Lsta doblemente enlazada la cual contiene gethead para obtener la cabeza de la lista
 * addToEnd para agregar los elementos al final de mi lista
 * removeFirst para eliminar la cabeza de mi dato y reasignarla a otro dato para que sea la nueva cabeza
 * show para poder mostrar todos mis datos en consola.
 * @author Drach
 */
public class DoubleEnlacedList {
    private int tamanio=0;
    private int nextId = 1;
    private String operation;
    private Node head;
    private Node tail;
    
    
    public Node getHead() {
        return head;
    }
    public Node getAll(int pos){
        int count = 0;
        Node temp = head;
        while(temp != null){
            if(count == pos){
                return temp;
            }
            temp = temp.next;
            count++;
        }
        return null;
    }
    
    public void addToEnd(Process process) {
        Node nodo = new Node(process);
        if (head == null) {
            head = tail = nodo;
        } else {
            nodo.prev = tail;
            tail.next = nodo;
            tail = nodo;
        }
        tamanio++;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    
    public void removeFirst() {
        if (head == null) {
            return; // La lista está vacía, no hay nada que eliminar
        }

        if (head == tail) {
            // Solo hay un nodo en la lista
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        tamanio--;
    }
    public void show() {
        Node current = head;
        while (current != null) {
            Process process = current.process;
            System.out.println("ID: " + process.getId());
            System.out.println("Nombre: " + process.getName());
            System.out.println("TME: " + process.getTme());
            System.out.println("Operación: " + process.getConcatenatedOperation());
            System.out.println(process.getConcatenatedOperation() + " =" + process.getResult());
            System.out.println("------");

            current = current.next;
        }
    }
}
