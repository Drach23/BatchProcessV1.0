
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Screen extends javax.swing.JFrame {

   private Timer timer;
    private int elapsedSeconds; //atributo para medir el tiempo pasado en segundos
    
    //Actualizador de tiempo con los segundos transcurridos
    private void updateTimerLabel() {
    int minutes = elapsedSeconds / 60;
    int seconds = elapsedSeconds % 60;
    String formattedTime = String.format("%02d:%02d", minutes, seconds);
    timeLabel.setText("Tiempo: " + formattedTime);
}
    public Screen() {
         initComponents(); //Inicia todos los componentes de la interfaz grafica
        timer = new Timer(1000, new ActionListener() {//objeto timer para el cual inicia con una accion
        public void actionPerformed(ActionEvent e) {
            elapsedSeconds++;
            updateTimerLabel();
        }
    });
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        executionEditorPane = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        finishEditorPane = new javax.swing.JEditorPane();
        executionLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        resultsButton = new javax.swing.JButton();
        finishLabel = new javax.swing.JLabel();
        waitLabel = new javax.swing.JLabel();
        numLotLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        numProcessLabel.setForeground(new java.awt.Color(224, 224, 224));
        numProcessLabel.setText("Numero de procesos: ");

        numProcessTextField.setBackground(new java.awt.Color(50, 50, 50));
        numProcessTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));
        numProcessTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numProcessTextFieldActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(50, 50, 50));
        jTable1.setForeground(new java.awt.Color(50, 50, 50));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Operacion", "TME", "En espera"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(120, 120, 120));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        executionEditorPane.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane2.setViewportView(executionEditorPane);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(executionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void numProcessTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numProcessTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numProcessTextFieldActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (!timer.isRunning()) {
              timer.start();
              elapsedSeconds = 0;
          }
        updateTimerLabel();
    }//GEN-LAST:event_startButtonActionPerformed

    private void resultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane executionEditorPane;
    private javax.swing.JLabel executionLabel;
    private javax.swing.JEditorPane finishEditorPane;
    private javax.swing.JLabel finishLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numLotLabel;
    private javax.swing.JLabel numProcessLabel;
    private javax.swing.JTextField numProcessTextField;
    private javax.swing.JButton resultsButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel waitLabel;
    // End of variables declaration//GEN-END:variables
}