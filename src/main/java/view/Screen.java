
package view;

//Importaciones del lenguaje
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Timer;
import java.util.List;

//Importaciones personales
import logic.TimeControl;
import logic.DataBank.OperationData;
import logic.DataBank;
import logic.DoubleEnlacedList;
import logic.Node;
import logic.ProcessManager;




//clase screen
public class Screen extends javax.swing.JFrame {
    private TimeControl timeControl; //declaracion del reloj
    private DoubleEnlacedList processList; // Declaración de la lista
    private ProcessManager manager;
    private int id = 1; //inicializa el ID en 0
    private int loteIndex = 0;
    private int indexLotes = 1;
    private int numProcess = 0;
    private int numLote = 0;
    private DoubleEnlacedList tempList;
    private DoubleEnlacedList tempListTerminados;
    private Timer reduce;
    

    //Constructor de mi clase screen
    public Screen() {
         initComponents(); //Inicia todos los componentes de la interfaz grafica
         
         reduce = new Timer(1000, begin);
         timeControl = new TimeControl(); // nuevo reloj para controlar el tiempo
         manager = new ProcessManager();

          /**
           * esta es la creacion del reloj para que pueda comenzar a funcionar, con los parametros adecuados.
           */
          Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timeControl.isRunning()) {
                    timeLabel.setText("Tiempo: " + timeControl.getFormattedElapsedTime());
                    
                }
            }
        });
        timer.start();

    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numProcessLabel = new javax.swing.JLabel();
        numProcessTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        finishEditorPane = new javax.swing.JEditorPane();
        executionLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        resultsButton = new javax.swing.JButton();
        finishLabel = new javax.swing.JLabel();
        waitLabel = new javax.swing.JLabel();
        numLotLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        executionTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        numProcessLabel.setForeground(new java.awt.Color(224, 224, 224));
        numProcessLabel.setText("Numero de procesos: ");

        numProcessTextField.setBackground(new java.awt.Color(50, 50, 50));
        numProcessTextField.setForeground(new java.awt.Color(245, 245, 245));
        numProcessTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));
        numProcessTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numProcessTextFieldActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(50, 50, 50));
        table.setForeground(new java.awt.Color(254, 254, 254));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Operacion", "TME"
            }
        ));
        table.setGridColor(new java.awt.Color(120, 120, 120));
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);
        table.getAccessibleContext().setAccessibleDescription("");

        finishEditorPane.setBackground(new java.awt.Color(50, 50, 50));
        finishEditorPane.setForeground(new java.awt.Color(224, 224, 224));
        jScrollPane3.setViewportView(finishEditorPane);

        executionLabel.setForeground(new java.awt.Color(224, 224, 224));
        executionLabel.setText("EN EJECUCION");

        startButton.setBackground(new java.awt.Color(150, 150, 150));
        startButton.setText("Generar");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(225, 225, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        resultsButton.setBackground(new java.awt.Color(150, 150, 150));
        resultsButton.setText("OBTENER RESULTADOS");
        resultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsButtonActionPerformed(evt);
            }
        });

        finishLabel.setBackground(new java.awt.Color(255, 255, 255));
        finishLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        finishLabel.setForeground(new java.awt.Color(224, 224, 224));
        finishLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finishLabel.setText("TERMINADOS");

        waitLabel.setForeground(new java.awt.Color(224, 224, 224));
        waitLabel.setText("EN ESPERA");

        numLotLabel.setForeground(new java.awt.Color(224, 224, 224));
        numLotLabel.setText("NUMERO DE LOTES PENDIENTES: ");

        executionTextArea.setColumns(20);
        executionTextArea.setRows(5);
        jScrollPane4.setViewportView(executionTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numProcessLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numProcessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(executionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(numLotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultsButton)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(waitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finishLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numProcessLabel)
                    .addComponent(numProcessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(executionLabel)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finishLabel)
                            .addComponent(waitLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultsButton)
                    .addComponent(numLotLabel))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ActionListener begin = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<DoubleEnlacedList> listTempLotes = manager.getList();
            if(loteIndex < listTempLotes.size()){
                tempList = listTempLotes.get(loteIndex);
                if(tempList.getTamanio() > 0){
                    
                    int lotesPend = indexLotes-2;
                    numLotLabel.setText("NUMERO DE LOTES PENDIENTES: " + lotesPend);
                    updateTable();
                    Node nodeTemp = tempList.getHead();
                    logic.Process proceso = nodeTemp.getProcess();
                    if(proceso.getTme()>0){
                         proceso.reduceTME();
                         String name = proceso.getId() + "- " + proceso.getName();
                         String operation = proceso.getNum1() +  proceso.getOperation() + proceso.getNum2();
                         String tme ="TME: " + proceso.getTme();
                         String textEjecution = name + "\n" + operation + "\n" + tme;
                         executionTextArea.setText(textEjecution);
                    }else{
                        numProcess--;
                        if(numProcess%5==0){
                            indexLotes--;
                            numLote++;
                        }
                        
                        tempListTerminados.addToEnd(proceso);
                        tempList.removeFirst();
                        Terminados();
                        timeControl.pause();
                        startTimeControl();
                    }
                }else{
                    loteIndex++;
                    timeControl.pause();
                    startTimeControl();
                }
                     
                
                
            }else{
                timeControl.pause();
                executionTextArea.setText(" ");
            }
            
        }
    };
    
    
    private void numProcessTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numProcessTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numProcessTextFieldActionPerformed

    /**
     * boton de generar el cual tiene las acciones del codigo. como iniciar el contador
     * generar un proceso aleatorio alimentado por mi banco de datos
     * generar el .txt inicial con los datos generados.
     * @param evt 
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        processList = new DoubleEnlacedList(); // Inicializa la lista aquí
         tempList = new DoubleEnlacedList();
         tempListTerminados = new DoubleEnlacedList();
        generateProcess();
        reduce.start();
        startTimeControl();
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void resultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsButtonActionPerformed
        try {
            int numLoteTemp = 0;
            int tempLote = numLote;
            String ruta = "Resultados.txt";
            DoubleEnlacedList tempLista = processList;
            int i=0;
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter archive = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(archive);
            
           
                
                
              
                Node temp = tempLista.getHead();

                while(temp!=null){
                    if (i % 5 == 0) {
                        if(tempLote != 0){
                            tempLote--;
                        }
                        numLoteTemp++;
                        writer.newLine();
                        String numeroLote = "--- Lote " + numLoteTemp + " ---";
                        writer.write(numeroLote);
                        writer.newLine();
                        writer.write("----------------------");
                    }
                     logic.Process proceso = temp.getProcess();
                     String name = proceso.getId() + "- " + proceso.getName();
                     String operation = proceso.getNum1() + " " +  proceso.getOperation() + " " + proceso.getNum2() + " = " + proceso.getResult();
                     String textTerminados = name + "\n" + operation + "\n";
                     temp = temp.next;
                     writer.newLine();
                     String texto = textTerminados;
                     writer.write(texto);
                     i++;
                }
                
            
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_resultsButtonActionPerformed

    private void startTimeControl(){//inicia mi reloj y lo valida que este funcionando
        if (!timeControl.isRunning()) {
            timeControl.start();
        }
    }
    
    /**
     * aqui se generan los procesos consumiendo mis datos en DataBank
     * y despues de ello se agregan a mi lista doblemente enlazada
     * en la posicion final. Adicional a ello agrega los datos a la tabla
     */
   private void generateProcess(){
        try {
       
            int cant = Integer.parseInt(numProcessTextField.getText());
            for (int i = 0; i < cant; i++) { //for para generar los datos
                if(i%5==0){
                    indexLotes++;
                }
                String name = DataBank.generateRandomName();
                DataBank.OperationData operationData = DataBank.generateRandomOperation(); //toma de datos de mi banco
                double num1 = operationData.num1;//banco de datos
                double num2 = operationData.num2;//banco de datos
                String operator = operationData.operation;
                
                double result = DataBank.resolveOperation(num1, num2, operator); //para calcular el resultado de la operacion


                int tme = DataBank.generateRandomTme(); //banco de datos
                logic.Process newProcess = new logic.Process(id, name, tme, operator, num1, num2, result); //creando un proceso con los datos de banco
                processList.addToEnd(newProcess); //añadiendo el proceso a la posicion final de la lista, si el primero se inserta como head
                manager.addProcess(newProcess);
                
                id++; //incrementa el ID en 1+1
                numProcess++;

            }
            
            processList.show();
            generateDatosText();
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
        }
    }
   
   public void generateDatosText(){
       try {
            int numLoteTemp = 0;
            int tempLote = numLote;
            String ruta = "Datos.txt";
            DoubleEnlacedList tempLista = processList;
            int i=0;
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter archive = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(archive);
            
           
                
                
              
                Node temp = tempLista.getHead();

                while(temp!=null){
                    if (i % 5 == 0) {
                        if(tempLote != 0){
                            tempLote--;
                        }
                        numLoteTemp++;
                        writer.newLine();
                        String numeroLote = "--- Lote " + numLoteTemp + " ---";
                        writer.write(numeroLote);
                        writer.newLine();
                        writer.write("----------------------");
                    }
                     logic.Process proceso = temp.getProcess();
                     String tme = "TME: " + proceso.getTme();
                     String name = proceso.getId() + "- " + proceso.getName();
                     String operation = proceso.getNum1() + " " +  proceso.getOperation() + " " + proceso.getNum2();
                     String textTerminados = name + "\n" + operation + "\n" + tme + "\n";
                     temp = temp.next;
                     writer.newLine();
                     String texto = textTerminados;
                     writer.write(texto);
                     i++;
                }
                
            
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
   
   public void Terminados(){
       String textTerminados = "Lote " + numLote + "\n";
       Node temp = tempListTerminados.getHead();
       int i = 0;
       
       while(temp!=null){
           if(i%5==0){
               textTerminados = "\nLote " + numLote + "\n";
           }
            logic.Process proceso = temp.getProcess();
            String name = proceso.getId() + "- " + proceso.getName();
            String operation = proceso.getNum1() + " " +  proceso.getOperation() + " " + proceso.getNum2() + " = " + proceso.getResult();
            textTerminados = textTerminados + name + "\n" + operation + "\n";
            temp = temp.next;
            i++;
       }
       finishEditorPane.setText(textTerminados);
   }
    
   //si funciona :D
    private void updateTable() {
        // Limpia el modelo de la tabla
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);

        // Llena la tabla con los datos de la lista actualizada
        Node current = tempList.getHead().next;
        String empty = " ";
        if(current==null){
            Object[] rowData = {empty, empty, empty, empty};
            tableModel.addRow(rowData);
        }
        while (current != null) {
            logic.Process process = current.process;
            String operation = process.getNum1() + " " +  process.getOperation() + " " + process.getNum2();
            Object[] rowData = {process.getId(), process.getName(), operation, process.getTme()};
            tableModel.addRow(rowData);
            current = current.next;
        }
        
    }
 



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel executionLabel;
    private javax.swing.JTextArea executionTextArea;
    private javax.swing.JEditorPane finishEditorPane;
    private javax.swing.JLabel finishLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel numLotLabel;
    private javax.swing.JLabel numProcessLabel;
    private javax.swing.JTextField numProcessTextField;
    private javax.swing.JButton resultsButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTable table;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel waitLabel;
    // End of variables declaration//GEN-END:variables
}
