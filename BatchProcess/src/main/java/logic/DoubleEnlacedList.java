package logic;

public class DoubleEnlacedList {
    private int nextId = 1;
    private String operation;
    private Node head;
    private Node tail;
    
    
    public Node getHead() {
        return head;
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
    }

    public void generateAndAddProcesses(int count) {
        for (int i = 0; i < count; i++) {
            String randomName = DataBank.generateRandomName();
            String randomOperation = DataBank.generateRandomOperation();
            int randomTme =DataBank.generateRandomTme();
            Process proceso = new Process(nextId, randomName, randomTme, randomOperation);
            addToEnd(proceso);
            nextId++;
        }
    }
}
