/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juancarlosfiltermartintarea6;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public class JuanCarlosFilterMartin extends javax.swing.JFrame {

    public JuanCarlosFilterMartin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codigoLb = new javax.swing.JLabel();
        buscarBt = new javax.swing.JButton();
        nombreLb = new javax.swing.JLabel();
        modificarBt = new javax.swing.JButton();
        cantidadLb = new javax.swing.JLabel();
        borrarBt = new javax.swing.JButton();
        descripcionLb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        codigoTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        cantidadTf = new javax.swing.JTextField();
        descripcionTf = new javax.swing.JTextField();
        insertarBt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        listadoLb = new javax.swing.JLabel();
        mostrarBt = new javax.swing.JButton();
        salirBt = new javax.swing.JButton();
        listadoTa = new javax.swing.JScrollPane();
        listadoTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de Gestión");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codigoLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codigoLb.setText("Codigo");

        buscarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscarBt.setText("BUSCAR");
        buscarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtActionPerformed(evt);
            }
        });

        nombreLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLb.setText("Nombre");

        modificarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modificarBt.setText("MODIFICAR");
        modificarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtActionPerformed(evt);
            }
        });

        cantidadLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cantidadLb.setText("Cantidad");

        borrarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borrarBt.setText("BORRAR");
        borrarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtActionPerformed(evt);
            }
        });

        descripcionLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        descripcionLb.setText("Descripción");

        codigoTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTfActionPerformed(evt);
            }
        });

        nombreTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTfActionPerformed(evt);
            }
        });

        cantidadTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        descripcionTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcionTf.setToolTipText("");

        insertarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertarBt.setText("INSERTAR");
        insertarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(insertarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buscarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(borrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLb)
                            .addComponent(cantidadLb)
                            .addComponent(nombreLb)
                            .addComponent(descripcionLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLb))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLb))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadLb)
                    .addComponent(cantidadTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionLb)
                    .addComponent(descripcionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(buscarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listadoLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listadoLb.setText("Listado de productos");

        mostrarBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrarBt.setText("MOSTRAR");
        mostrarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        salirBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirBt.setText("SALIR");
        salirBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtActionPerformed(evt);
            }
        });

        listadoTextArea.setColumns(20);
        listadoTextArea.setRows(5);
        listadoTa.setViewportView(listadoTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mostrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(salirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(listadoLb)
                        .addComponent(listadoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(listadoLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listadoTa)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTfActionPerformed

    }//GEN-LAST:event_codigoTfActionPerformed

    private void salirBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtActionPerformed

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed
        //Objeto fichero sin parámetros (Contiene toda la lectura del fichero)
        /* Agregamos Codigo, nombre, cantidad y descripcion del textField a nuestro array y 
        se guardar en el fichero con el metodo insertarProducto*/
        Fichero f = new Fichero();
        f.insertarProducto(this.codigoTf.getText(), this.nombreTf.getText(),
                this.cantidadTf.getText(), this.descripcionTf.getText());
        limpiarCampos();

    }//GEN-LAST:event_insertarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        //Objeto fichero sin parámetros (Contiene toda la lectura del fichero)
        //Mostramos en el listadoTa el texto obtenido en el método listado de la clase fichero*/
        Fichero f = new Fichero();
        this.listadoTextArea.setText(f.mostrarListado());
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void buscarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtActionPerformed
        //Objeto fichero sin parámetros (Contiene toda la lectura del fichero)
        //buscamos la matricula escrita en el TextField con el metodo buscar de la clase Fichero*/
        Fichero f = new Fichero();
        //Preguntamos y almacenamos la respuesta en la variable, segun indiquemos se realizará una u otra cosa
        int question = f.PreguntashowDialog("¿Como quieres buscar el código?","Completo", "Por coincidencias");
        if (question == 0) {
            Producto productoEncontrado = f.buscar(this.codigoTf.getText());
            //Si cocheEncontrado existe
            if (productoEncontrado != null) {
                //coge el codigo, nombre, cantidad, descripcion y lo pinta en el TextArea con el toString
                //coge el nombre, cantidad, descripcion y lo pinta en sus TextField
                this.listadoTextArea.setText("---- SE HA ENCONTRADO EL SIGUIENTE PRODUCTO ----" + System.lineSeparator()
                        + productoEncontrado.toString());

                this.nombreTf.setText(productoEncontrado.getNombre());
                this.cantidadTf.setText(productoEncontrado.getCantidad());
                this.descripcionTf.setText(productoEncontrado.getDescripcion());
            } else {
                //Si no existe deja vacío ambos TextField y en el TextArea indica que no se ha encontrado.
                limpiarCampos();
                this.listadoTextArea.setText("NO SE HA ENCONTRADO EL PRODUCTO INDICADO");
            }

        } else {
            //ArrayList de producto que  va a almacenar lo que se recoja en el metodo findCoincidencia
            ArrayList<Producto> arrayCoincidencia = f.findCoincidencia(this.codigoTf.getText());
            //Se comprueba que el campo textFiel y el array obtenido del método findCoincidencia no esté vacio
            if (!this.codigoTf.getText().isEmpty()) { 
                if (!arrayCoincidencia.isEmpty()) {
                    /*Si no está vació se reestablece el TextArea y se va recorriendo 
                    el array pintando cada producto con coincidencia mediante el for*/
                    this.listadoTextArea.setText("");
                    this.listadoTextArea.setText(" ---- LAS COINCIDENCIAS SON LAS SIGUIENTES ----\n");
                    for (int i = 0; i < arrayCoincidencia.size(); i++) {
                        this.listadoTextArea.append(arrayCoincidencia.get(i).toString());
                    }
                    //Por ultimo si nos e entra en sus respectivos if se mandará un mensaje de error
                } else {
                    this.listadoTextArea.setText("NO HAY COINCIDENCIA PARA EL CÓDIGO: " + this.codigoTf.getText());
                }
            } else {
                this.listadoTextArea.setText("INTRODUCE ALMENOS UN CODIGO PARA BUSCAR");
            }
            

        }


    }//GEN-LAST:event_buscarBtActionPerformed

    private void nombreTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTfActionPerformed

    }//GEN-LAST:event_nombreTfActionPerformed

    private void modificarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtActionPerformed
        /*Objeto fichero sin parámetros (Contiene toda la lectura del fichero)
        modificamos los nuevos textField indicados siempre que se cumpla que el
        codigoTf ya exista*/
        Fichero f = new Fichero();
        f.modificarProducto(this.codigoTf.getText(), this.nombreTf.getText(),
                this.cantidadTf.getText(), this.descripcionTf.getText());

    }//GEN-LAST:event_modificarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed
        //Objeto fichero sin parámetros (Contiene toda la lectura del fichero)
        /*eliminamos el producto relacionado con el codigo del TextFiel si 
        existe con el metodo borrarProducto de la clase Fichero*/
        Fichero f = new Fichero();
        f.borrarProducto(this.codigoTf.getText());
        limpiarCampos();
    }//GEN-LAST:event_borrarBtActionPerformed

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
            java.util.logging.Logger.getLogger(JuanCarlosFilterMartin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuanCarlosFilterMartin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuanCarlosFilterMartin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuanCarlosFilterMartin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuanCarlosFilterMartin().setVisible(true);
            }
        });
    }

    /**
     * Método para limpiar los campos
     */
    private void limpiarCampos() {
        this.codigoTf.setText("");
        this.nombreTf.setText("");
        this.cantidadTf.setText("");
        this.descripcionTf.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBt;
    private javax.swing.JButton buscarBt;
    private javax.swing.JLabel cantidadLb;
    private javax.swing.JTextField cantidadTf;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigoTf;
    private javax.swing.JLabel descripcionLb;
    private javax.swing.JTextField descripcionTf;
    private javax.swing.JButton insertarBt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel listadoLb;
    private javax.swing.JScrollPane listadoTa;
    private javax.swing.JTextArea listadoTextArea;
    private javax.swing.JButton modificarBt;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JButton salirBt;
    // End of variables declaration//GEN-END:variables
}
