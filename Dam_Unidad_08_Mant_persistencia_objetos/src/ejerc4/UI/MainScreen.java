package ejerc4.UI;

import ejerc4.consultas_db4o.Consultas_con_Db4o;

public class MainScreen extends javax.swing.JFrame {
    private Consultas_con_Db4o bd;
        
    public MainScreen() {
        bd = new Consultas_con_Db4o();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameText = new javax.swing.JTextField();
        EdadText = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        EdadJLabel = new javax.swing.JLabel();
        deporteText = new javax.swing.JTextField();
        deporteJLabel = new javax.swing.JLabel();
        paisJLabel = new javax.swing.JLabel();
        paisText = new javax.swing.JTextField();
        addPlayerButton = new javax.swing.JButton();
        showAllButton = new javax.swing.JButton();
        findByNameButton = new javax.swing.JButton();
        findGreaterThanButton = new javax.swing.JButton();
        findByNameText = new javax.swing.JTextField();
        findGreaterThanText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        showTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameJLabel.setText("Nombre");

        EdadJLabel.setText("Edad");

        deporteJLabel.setText("Deporte");

        paisJLabel.setText("Pais");

        addPlayerButton.setText("Add player");
        addPlayerButton.setActionCommand("Añadir jugador");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        showAllButton.setText("Mostrar todos");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });

        findByNameButton.setText("Buscar por nombre");
        findByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findByNameButtonActionPerformed(evt);
            }
        });

        findGreaterThanButton.setText("Buscar mayores que");
        findGreaterThanButton.setActionCommand("Buscar mayores que");
        findGreaterThanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findGreaterThanButtonActionPerformed(evt);
            }
        });

        findByNameText.setToolTipText("");

        showTextArea.setColumns(20);
        showTextArea.setRows(5);
        jScrollPane2.setViewportView(showTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(findByNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findGreaterThanText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameJLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EdadText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EdadJLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deporteText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deporteJLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(paisJLabel)
                                        .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(addPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(showAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(findByNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(findGreaterThanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJLabel)
                            .addComponent(EdadJLabel)
                            .addComponent(deporteJLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paisJLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deporteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addPlayerButton)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findByNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findGreaterThanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAllButton)
                    .addComponent(findByNameButton)
                    .addComponent(findGreaterThanButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        String name = this.nameText.getText();
        String age = this.EdadText.getText();
        String sport = this.deporteText.getText();
        String country = this.paisText.getText();
        bd.addPlayer(name, sport, country, Integer.parseInt(age));
        this.showTextArea.setText("Jugador añadido con exito");
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        String showText = bd.buscarJugadores(null, null, null, null);
        this.showTextArea.setText(showText);
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void findByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findByNameButtonActionPerformed
        String showText = bd.buscarJugadores(this.findByNameText.getText(), 
                null, null, null);
        this.showTextArea.setText(showText);
    }//GEN-LAST:event_findByNameButtonActionPerformed

    private void findGreaterThanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findGreaterThanButtonActionPerformed
        int edad = Integer.parseInt(this.findGreaterThanText.getText());
        String showText = bd.buscarJugadoresMayoresQue(edad);
        this.showTextArea.setText(showText);
    }//GEN-LAST:event_findGreaterThanButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EdadJLabel;
    private javax.swing.JTextField EdadText;
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JLabel deporteJLabel;
    private javax.swing.JTextField deporteText;
    private javax.swing.JButton findByNameButton;
    private javax.swing.JTextField findByNameText;
    private javax.swing.JButton findGreaterThanButton;
    private javax.swing.JTextField findGreaterThanText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel paisJLabel;
    private javax.swing.JTextField paisText;
    private javax.swing.JButton showAllButton;
    private javax.swing.JTextArea showTextArea;
    // End of variables declaration//GEN-END:variables
}


