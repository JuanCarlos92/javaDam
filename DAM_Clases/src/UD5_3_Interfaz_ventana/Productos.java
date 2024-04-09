/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UD5_3_Interfaz_ventana;

/**
 *
 * @author Juan Carlos
 */
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    private String productos = "";
    public Productos() {
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

        panelIzquierdoPn = new javax.swing.JPanel();
        datosProductoLb = new javax.swing.JLabel();
        codigoLb = new javax.swing.JLabel();
        nombreLb = new javax.swing.JLabel();
        precioLb = new javax.swing.JLabel();
        descripcionLb = new javax.swing.JLabel();
        codigoTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        precioTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionTa = new javax.swing.JTextArea();
        insertarBt = new javax.swing.JButton();
        borrarBt = new javax.swing.JButton();
        panelDerechoPn = new javax.swing.JPanel();
        mostrarProductoLb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarProductoTa = new javax.swing.JTextArea();
        mostrarBt = new javax.swing.JButton();
        limpiarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelIzquierdoPn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datosProductoLb.setText("Datos del Producto");

        codigoLb.setText("Código");

        nombreLb.setText("Nombre");

        precioLb.setText("Precio");

        descripcionLb.setText("Descripción");

        descripcionTa.setColumns(20);
        descripcionTa.setRows(5);
        jScrollPane1.setViewportView(descripcionTa);

        insertarBt.setText("Insertar");
        insertarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtActionPerformed(evt);
            }
        });

        borrarBt.setText("Borrar");
        borrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdoPnLayout = new javax.swing.GroupLayout(panelIzquierdoPn);
        panelIzquierdoPn.setLayout(panelIzquierdoPnLayout);
        panelIzquierdoPnLayout.setHorizontalGroup(
            panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoPnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoPnLayout.createSequentialGroup()
                        .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIzquierdoPnLayout.createSequentialGroup()
                                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioLb)
                                    .addComponent(nombreLb)
                                    .addComponent(codigoLb))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdoPnLayout.createSequentialGroup()
                                .addComponent(descripcionLb)
                                .addGap(18, 18, 18)))
                        .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borrarBt)
                            .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(codigoTf)
                                .addComponent(nombreTf)
                                .addComponent(precioTf))
                            .addComponent(datosProductoLb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(insertarBt))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelIzquierdoPnLayout.setVerticalGroup(
            panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoPnLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(datosProductoLb)
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLb)
                    .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLb)
                    .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLb)
                    .addComponent(precioTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionLb)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIzquierdoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarBt)
                    .addComponent(insertarBt))
                .addGap(17, 17, 17))
        );

        panelDerechoPn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mostrarProductoLb.setText("Mostrar Productos");

        mostrarProductoTa.setColumns(20);
        mostrarProductoTa.setRows(5);
        jScrollPane2.setViewportView(mostrarProductoTa);

        mostrarBt.setText("Mostrar");
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        limpiarBt.setText("Limpiar");
        limpiarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDerechoPnLayout = new javax.swing.GroupLayout(panelDerechoPn);
        panelDerechoPn.setLayout(panelDerechoPnLayout);
        panelDerechoPnLayout.setHorizontalGroup(
            panelDerechoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoPnLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(panelDerechoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoPnLayout.createSequentialGroup()
                        .addComponent(mostrarProductoLb)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoPnLayout.createSequentialGroup()
                        .addGroup(panelDerechoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelDerechoPnLayout.createSequentialGroup()
                                .addComponent(mostrarBt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiarBt))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        panelDerechoPnLayout.setVerticalGroup(
            panelDerechoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoPnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mostrarProductoLb)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDerechoPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarBt)
                    .addComponent(limpiarBt))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIzquierdoPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDerechoPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelIzquierdoPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDerechoPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed
        String codigo = codigoTf.getText();
        String nombre = nombreTf.getText();
        String precio = precioTf.getText();
        String descripcion = descripcionTa.getText();
        
        this.productos = this.productos.concat(codigo + " - " + nombre + " - " + precio + " - " + descripcion + "\n" );
        
        limpiarTextos();
    }//GEN-LAST:event_insertarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed
        limpiarTextos();
    }//GEN-LAST:event_borrarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        mostrarProductoTa.append(productos);
        this.productos="";
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void limpiarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtActionPerformed
        mostrarProductoTa.setText("");
    }//GEN-LAST:event_limpiarBtActionPerformed
    private void limpiarTextos(){
        codigoTf.setText("");
        nombreTf.setText("");
        precioTf.setText("");
        descripcionTa.setText("");
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBt;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigoTf;
    private javax.swing.JLabel datosProductoLb;
    private javax.swing.JLabel descripcionLb;
    private javax.swing.JTextArea descripcionTa;
    private javax.swing.JButton insertarBt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBt;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JLabel mostrarProductoLb;
    private javax.swing.JTextArea mostrarProductoTa;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JPanel panelDerechoPn;
    private javax.swing.JPanel panelIzquierdoPn;
    private javax.swing.JLabel precioLb;
    private javax.swing.JTextField precioTf;
    // End of variables declaration//GEN-END:variables
}
