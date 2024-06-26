/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UD5_4_Interfaz_ventana;

import java.awt.PageAttributes;

/**
 *
 * @author Juan Carlos
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIzq = new javax.swing.JPanel();
        marcaLb = new javax.swing.JLabel();
        matriculaLb = new javax.swing.JLabel();
        colorLb = new javax.swing.JLabel();
        marcaTf = new javax.swing.JTextField();
        matriculaTf = new javax.swing.JTextField();
        colorTf = new javax.swing.JTextField();
        altaBt = new javax.swing.JButton();
        mostrarBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mensajeLb = new javax.swing.JLabel();
        panelDrch = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marcaLb.setText("Marca");

        matriculaLb.setText("Matrícula");

        colorLb.setText("Color");

        altaBt.setText("Alta");
        altaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaBtActionPerformed(evt);
            }
        });

        mostrarBt.setText("Mostrar");
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzqLayout = new javax.swing.GroupLayout(panelIzq);
        panelIzq.setLayout(panelIzqLayout);
        panelIzqLayout.setHorizontalGroup(
            panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(altaBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(mostrarBt)
                .addGap(80, 80, 80))
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matriculaLb, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(colorLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marcaLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcaTf)
                            .addComponent(matriculaTf)
                            .addComponent(colorTf, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(panelIzqLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensajeLb)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIzqLayout.setVerticalGroup(
            panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaLb)
                    .addComponent(marcaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaLb)
                    .addComponent(matriculaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLb)
                    .addComponent(colorTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaBt)
                    .addComponent(mostrarBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeLb)
                .addGap(61, 61, 61))
        );

        listadoTa.setColumns(20);
        listadoTa.setRows(5);
        jScrollPane1.setViewportView(listadoTa);

        javax.swing.GroupLayout panelDrchLayout = new javax.swing.GroupLayout(panelDrch);
        panelDrch.setLayout(panelDrchLayout);
        panelDrchLayout.setHorizontalGroup(
            panelDrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        panelDrchLayout.setVerticalGroup(
            panelDrchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDrch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaBtActionPerformed
        // TODO add your handling code here:
        String marca = this.marcaTf.getText();
        String color = this.colorTf.getText();
        String matricula = this.matriculaTf.getText();
        
        
        
        if (marca.length() > 0 && matricula.length() > 0 && color.length()> 0) {
            Coche c1 = new Coche(marca, matricula, color);
            String s = c1.altas();
        this.listadoTa.setText(s);
        
        }else{
            Coche c1 = new Coche();
            this.mensajeLb.setText("Tienes que rellenar todos los campos");
            
            limpiarCampos();
        }
        
    }//GEN-LAST:event_altaBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        // TODO add your handling code here:
        
        Coche c1 = new Coche();
        this.listadoTa.setText(c1.listado());
    }//GEN-LAST:event_mostrarBtActionPerformed
    
    private void limpiarCampos(){
        this.matriculaTf.setText("");
        this.colorTf.setText("");
        this.marcaTf.setText("");
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaBt;
    private javax.swing.JLabel colorLb;
    private javax.swing.JTextField colorTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listadoTa;
    private javax.swing.JLabel marcaLb;
    private javax.swing.JTextField marcaTf;
    private javax.swing.JLabel matriculaLb;
    private javax.swing.JTextField matriculaTf;
    private javax.swing.JLabel mensajeLb;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JPanel panelDrch;
    private javax.swing.JPanel panelIzq;
    // End of variables declaration//GEN-END:variables
}
