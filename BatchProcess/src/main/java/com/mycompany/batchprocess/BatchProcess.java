
package com.mycompany.batchprocess;

import view.Screen;

public class BatchProcess {

        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }
}
