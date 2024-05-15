
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Juan Carlos
 */
public class VentanaUI extends javax.swing.JFrame {

    /**
     * Creates new form VentanaUI
     */
    public VentanaUI() {
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

        mostrarBt1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        insertarBt = new javax.swing.JButton();
        modificarBt = new javax.swing.JButton();
        borrarBt = new javax.swing.JButton();
        codigoLb = new javax.swing.JLabel();
        codigoTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        nombreLb = new javax.swing.JLabel();
        idlocalizacionTf = new javax.swing.JTextField();
        idlocalizacionLb = new javax.swing.JLabel();
        idmanagerTf = new javax.swing.JTextField();
        idmanagerLb = new javax.swing.JLabel();
        titulodatosLb1 = new javax.swing.JLabel();
        mensajeLb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mostrarBt = new javax.swing.JButton();
        salirBt = new javax.swing.JButton();
        titulomostrarLb = new javax.swing.JLabel();
        limpiarCamposBt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDepartamento = new javax.swing.JTable();

        mostrarBt1.setText("MOSTRAR");
        mostrarBt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBt1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 211, 157));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        insertarBt.setText("INSERTAR");
        insertarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtActionPerformed(evt);
            }
        });

        modificarBt.setText("MODIFICAR");
        modificarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtActionPerformed(evt);
            }
        });

        borrarBt.setText("BORRAR");
        borrarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtActionPerformed(evt);
            }
        });

        codigoLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        codigoLb.setText("Código");

        nombreLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nombreLb.setText("Nombre");

        idlocalizacionLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        idlocalizacionLb.setText("ID Localización");

        idmanagerLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        idmanagerLb.setText("ID Manager");

        titulodatosLb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulodatosLb1.setText("Datos del Departamento");

        mensajeLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mensajeLb.setForeground(new java.awt.Color(255, 51, 51));
        mensajeLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulodatosLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mensajeLb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(insertarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modificarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(borrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idmanagerLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreLb, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codigoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idlocalizacionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idlocalizacionTf)
                                    .addComponent(idmanagerTf)
                                    .addComponent(codigoTf, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(nombreTf))))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(titulodatosLb1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLb)
                    .addComponent(codigoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLb)
                    .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlocalizacionLb)
                    .addComponent(idlocalizacionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idmanagerLb)
                    .addComponent(idmanagerTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(mensajeLb)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(255, 211, 157));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mostrarBt.setText("MOSTRAR");
        mostrarBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        salirBt.setText("SALIR");
        salirBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtActionPerformed(evt);
            }
        });

        titulomostrarLb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulomostrarLb.setText("Mostrar datos del departamento");

        limpiarCamposBt.setText("LIMPIAR CAMPOS");
        limpiarCamposBt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiarCamposBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposBtActionPerformed(evt);
            }
        });

        tablaDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "ID Localización", "ID Manager"
            }
        ));
        jScrollPane2.setViewportView(tablaDepartamento);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulomostrarLb, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(limpiarCamposBt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(mostrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(titulomostrarLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarCamposBt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtActionPerformed

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed
        GestorBD baseDatos = new GestorBD();

        String msg = CamposVaciosJFrame.controlarCamposVacios(this.codigoTf.getText(), this.nombreTf.getText(),
                this.idlocalizacionTf.getText(), this.idmanagerTf.getText());

        if (msg == null) {
            //llamada del metodo alta de departamento
            baseDatos.alta(Integer.parseInt(this.codigoTf.getText()), this.nombreTf.getText(),
                    Integer.parseInt(this.idlocalizacionTf.getText()), Integer.parseInt(this.idmanagerTf.getText()));

            //LLamada del metodo mostrar
            mostrar();

        } else {
            baseDatos.ErrorshowDialog(msg);
        }


    }//GEN-LAST:event_insertarBtActionPerformed

    private void modificarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtActionPerformed
        GestorBD baseDatos = new GestorBD();

        String msg = CamposVaciosJFrame.controlarCampoCodigo(this.codigoTf.getText());

        if (msg == null) {
            //llamada al metodo Actualizar Departamento
            baseDatos.actualizar(Integer.parseInt(this.codigoTf.getText()), this.nombreTf.getText(),
                    Integer.parseInt(this.idlocalizacionTf.getText()), Integer.parseInt(this.idmanagerTf.getText()));

            //LLamada del metodo mostrar
            mostrar();

        } else {
            //Si el campo codigo está vacio lo indicamos 
            baseDatos.ErrorshowDialog(msg);
        }
    }//GEN-LAST:event_modificarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed
        GestorBD baseDatos = new GestorBD();

        String msg = CamposVaciosJFrame.controlarCampoCodigo(this.codigoTf.getText());

        if (msg == null) {

            //llamada al metodo borrar departamento
            String mensajeBorrar = baseDatos.Borrar(Integer.parseInt(this.codigoTf.getText()));

            this.mensajeLb.setText(mensajeBorrar);

            //LLamada del metodo mostrar
            mostrar();

        } else {
            //Si el campo codigo está vacio lo indicamos 
            baseDatos.ErrorshowDialog(msg);
        }

    }//GEN-LAST:event_borrarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        //LLamada del metodo mostrar
        mostrar();
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void mostrarBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarBt1ActionPerformed

    private void limpiarCamposBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposBtActionPerformed
        //Limpiamos los campos TextField
        limpiarCampos();
    }//GEN-LAST:event_limpiarCamposBtActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUI().setVisible(true);
            }
        });
    }

    private void mostrar() {
        DefaultTableModel dm = (DefaultTableModel) tablaDepartamento.getModel();
        //Para borrar los elementos de la lista y reiniciarlos
        dm.getDataVector().removeAllElements();

        //objetos de la calse conector base de datos
        GestorBD baseDatos = new GestorBD();
        //Arraylist 
        ArrayList<Departamento> departamentos = baseDatos.mostrar();

        //bucle para recorrer el arraylist
        for (int i = 0; i < departamentos.size(); i++) {
            String datosTabla[] = {Integer.toString(departamentos.get(i).getCodigo()),
                departamentos.get(i).getNombre(), Integer.toString(departamentos.get(i).getIdLocalizacion()),
                Integer.toString(departamentos.get(i).getIdManager())};

            DefaultTableModel dm1 = (DefaultTableModel) tablaDepartamento.getModel();
            dm1.addRow(datosTabla);
        }
    }

    private void limpiarCampos() {
        this.codigoTf.setText("");
        this.nombreTf.setText("");
        this.idlocalizacionTf.setText("");
        this.idmanagerTf.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBt;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigoTf;
    private javax.swing.JLabel idlocalizacionLb;
    private javax.swing.JTextField idlocalizacionTf;
    private javax.swing.JLabel idmanagerLb;
    private javax.swing.JTextField idmanagerTf;
    private javax.swing.JButton insertarBt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarCamposBt;
    private javax.swing.JLabel mensajeLb;
    private javax.swing.JButton modificarBt;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JButton mostrarBt1;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JButton salirBt;
    private javax.swing.JTable tablaDepartamento;
    private javax.swing.JLabel titulodatosLb1;
    private javax.swing.JLabel titulomostrarLb;
    // End of variables declaration//GEN-END:variables
}