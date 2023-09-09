
package logic;

import java.util.ArrayList;
import java.util.List;

public class ProcessManager {
private List<DoubleEnlacedList> batches;
private int currentBatchIndex;

public ProcessManager(){
    batches = new ArrayList<>();
    currentBatchIndex = 0;
    batches.add(new DoubleEnlacedList());
}
public void addProcess(Process process){
    if(currentBatchIndex >= batches.size()){
        batches.add(new DoubleEnlacedList());
}
    DoubleEnlacedList currentBatch = batches.get(currentBatchIndex);
    currentBatch.addToEnd(process);
    
    if (currentBatch.getTamanio() >=5){
    currentBatchIndex++;
    }
}
public void showAllBatches(){
for (int i = 0;i<batches.size();i++){
    System.out.println("Lote " + (i+1));
    batches.get(i).show();
    System.out.println("=================");
}
}

public List<DoubleEnlacedList> getList(){
    return batches;
}

}
