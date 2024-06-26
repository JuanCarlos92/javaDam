/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ud8_1_bd4o;

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

        codigoLb = new javax.swing.JLabel();
        precioLb = new javax.swing.JLabel();
        nombreLb = new javax.swing.JLabel();
        descripcionLb = new javax.swing.JLabel();
        codigoTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        precioTf = new javax.swing.JTextField();
        descripcionTf = new javax.swing.JTextField();
        insertarBt = new javax.swing.JButton();
        borrarBt = new javax.swing.JButton();
        salirBt = new javax.swing.JButton();
        modificarBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajeTa = new javax.swing.JTextArea();
        mostrarBt = new javax.swing.JButton();
        mensajeLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoLb.setText("Código");

        precioLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        precioLb.setText("Precio");

        nombreLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreLb.setText("Nombre");

        descripcionLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcionLb.setText("Descripción");

        codigoTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nombreTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        precioTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        descripcionTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        salirBt.setText("Salir");

        modificarBt.setText("Modificar");
        modificarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtActionPerformed(evt);
            }
        });

        mensajeTa.setColumns(20);
        mensajeTa.setRows(5);
        jScrollPane1.setViewportView(mensajeTa);

        mostrarBt.setText("Mostrar");
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(borrarBt)
                    .addComponent(insertarBt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(codigoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descripcionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precioLb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreLb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoTf, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(nombreTf)
                            .addComponent(precioTf)
                            .addComponent(descripcionTf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modificarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salirBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mensajeLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLb)
                            .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLb)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioLb)
                            .addComponent(precioTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionLb)
                            .addComponent(descripcionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertarBt)
                            .addComponent(modificarBt)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarBt)
                    .addComponent(salirBt)
                    .addComponent(mostrarBt)
                    .addComponent(mensajeLb))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed
        
        Articulos art = new Articulos(Integer.parseInt(this.codigoTf.getText()), this.nombreTf.getText(), Integer.parseInt(this.precioTf.getText()), this.descripcionTf.getText());
        
        DBArticulos db = new DBArticulos();
        
        String mensaje = db.alta(art);
        
        this.mensajeLb.setText(mensaje);
        

    }//GEN-LAST:event_insertarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        
        DBArticulos db = new DBArticulos();
        String mensaje = db.mostrar();
        
       // this.mensajeTa.setText("");
       //método .append --> añade al textarea
        this.mensajeTa.setText(mensaje);
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed
        int codigo = Integer.parseInt(this.codigoTf.getText());
        DBArticulos db = new DBArticulos();
        String mensaje = db.borrar(codigo);
        
        this.mensajeLb.setText(mensaje);
        
        //Borra  tambien la lista del textArea generada con mostrar
        String mensajeMostrar = db.mostrar();

        this.mensajeTa.setText(mensajeMostrar);
    }//GEN-LAST:event_borrarBtActionPerformed

    private void modificarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtActionPerformed
        int codigo = Integer.parseInt(this.codigoTf.getText());
        DBArticulos db = new DBArticulos();
        String mensaje = db.modificar(codigo, this.nombreTf.getText(),Integer.parseInt(this.precioTf.getText()), this.descripcionTf.getText());
        
        //Mostramos el mensaje si se ha modificado o no
        this.mensajeLb.setText(mensaje);
        
        //Borra  tambien la lista del textArea generada con mostrar
        String mensajeMostrar = db.mostrar();

        this.mensajeTa.setText(mensajeMostrar);
    }//GEN-LAST:event_modificarBtActionPerformed

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
    private javax.swing.JButton borrarBt;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigoTf;
    private javax.swing.JLabel descripcionLb;
    private javax.swing.JTextField descripcionTf;
    private javax.swing.JButton insertarBt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensajeLb;
    private javax.swing.JTextArea mensajeTa;
    private javax.swing.JButton modificarBt;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JLabel precioLb;
    private javax.swing.JTextField precioTf;
    private javax.swing.JButton salirBt;
    // End of variables declaration//GEN-END:variables
}
