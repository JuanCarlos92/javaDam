package gestion_de_alumnos;

public class GUI extends javax.swing.JFrame {
    Database db;

    public GUI() {
        db = new Database();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentId_label = new javax.swing.JLabel();
        studentName_label = new javax.swing.JLabel();
        studentSurname_label = new javax.swing.JLabel();
        studentAverage_label = new javax.swing.JLabel();
        studentTutor_label = new javax.swing.JLabel();
        studentId_text = new javax.swing.JTextField();
        studentName_text = new javax.swing.JTextField();
        studentSurname_text = new javax.swing.JTextField();
        studentAverage_text = new javax.swing.JTextField();
        studentTutor_text = new javax.swing.JTextField();
        addStudent_button = new javax.swing.JButton();
        updateStudent_button = new javax.swing.JButton();
        studentIdToFind_text = new javax.swing.JTextField();
        deleteStudent_button = new javax.swing.JButton();
        searchStudent_button = new javax.swing.JButton();
        studentIdToFind_label = new javax.swing.JLabel();
        showAllButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentId_label.setText("ID");

        studentName_label.setText("Nombre");

        studentSurname_label.setText("Apellidos");

        studentAverage_label.setText("Nota media");

        studentTutor_label.setText("Tutor");

        addStudent_button.setText("Añadir alumno");
        addStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent_buttonActionPerformed(evt);
            }
        });

        updateStudent_button.setText("Actualizar alumno");
        updateStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudent_buttonActionPerformed(evt);
            }
        });

        deleteStudent_button.setText("Eliminar alumno por ID");
        deleteStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudent_buttonActionPerformed(evt);
            }
        });

        searchStudent_button.setText("Buscar alumno por ID");
        searchStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudent_buttonActionPerformed(evt);
            }
        });

        studentIdToFind_label.setText("ID del alumno");

        showAllButton.setText("Mostrar todos los alumnos");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });

        result_textArea.setColumns(20);
        result_textArea.setRows(5);
        jScrollPane1.setViewportView(result_textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(studentId_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(studentName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(studentId_text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(studentName_text)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(studentSurname_label, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(studentSurname_text))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(studentAverage_text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(studentTutor_text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(studentAverage_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(studentTutor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(deleteStudent_button, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                            .addComponent(addStudent_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(updateStudent_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(searchStudent_button, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentIdToFind_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentIdToFind_text, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentId_label)
                    .addComponent(studentName_label)
                    .addComponent(studentSurname_label)
                    .addComponent(studentAverage_label)
                    .addComponent(studentTutor_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentId_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentName_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentSurname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentAverage_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentTutor_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudent_button)
                    .addComponent(updateStudent_button))
                .addGap(27, 27, 27)
                .addComponent(studentIdToFind_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentIdToFind_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteStudent_button)
                    .addComponent(searchStudent_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showAllButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent_buttonActionPerformed
        int id = Integer.parseInt(this.studentId_text.getText());
        String name = this.studentName_text.getText();
        String surname = this.studentSurname_text.getText();
        double average = Double.valueOf(this.studentAverage_text.getText());
        String tutor = this.studentTutor_text.getText();
        String txt = this.db.addStudent(id, name, surname, average, tutor);
        this.result_textArea.setText(txt);
    }//GEN-LAST:event_addStudent_buttonActionPerformed

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        String txt = this.db.showAll();
        this.result_textArea.setText(txt);
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void updateStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudent_buttonActionPerformed
        int id = Integer.parseInt(this.studentId_text.getText());
        String name = this.studentName_text.getText();
        String surname = this.studentSurname_text.getText();
        double average = Double.valueOf(this.studentAverage_text.getText());
        String tutor = this.studentTutor_text.getText();
        String txt = this.db.updateStudent(id, name, surname, average, tutor);
        this.result_textArea.setText(txt);
    }//GEN-LAST:event_updateStudent_buttonActionPerformed

    private void deleteStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudent_buttonActionPerformed
        int id = Integer.parseInt(this.studentIdToFind_text.getText());
        String txt = this.db.deleteStudent(id);
        this.result_textArea.setText(txt);
    }//GEN-LAST:event_deleteStudent_buttonActionPerformed

    private void searchStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudent_buttonActionPerformed
        int id = Integer.parseInt(this.studentIdToFind_text.getText());
        String txt = this.db.searchStudent(id);
        this.result_textArea.setText(txt);
    }//GEN-LAST:event_searchStudent_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent_button;
    private javax.swing.JButton deleteStudent_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result_textArea;
    private javax.swing.JButton searchStudent_button;
    private javax.swing.JButton showAllButton;
    private javax.swing.JLabel studentAverage_label;
    private javax.swing.JTextField studentAverage_text;
    private javax.swing.JLabel studentIdToFind_label;
    private javax.swing.JTextField studentIdToFind_text;
    private javax.swing.JLabel studentId_label;
    private javax.swing.JTextField studentId_text;
    private javax.swing.JLabel studentName_label;
    private javax.swing.JTextField studentName_text;
    private javax.swing.JLabel studentSurname_label;
    private javax.swing.JTextField studentSurname_text;
    private javax.swing.JLabel studentTutor_label;
    private javax.swing.JTextField studentTutor_text;
    private javax.swing.JButton updateStudent_button;
    // End of variables declaration//GEN-END:variables
}


