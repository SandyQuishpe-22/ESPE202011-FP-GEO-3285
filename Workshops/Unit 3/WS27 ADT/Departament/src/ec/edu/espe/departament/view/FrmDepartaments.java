/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.departament.view;

import ec.edu.ec.espe.departament.controler.DepartamentController;
import ec.edu.ec.espe.departament.model.Departament;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrmDepartaments extends javax.swing.JFrame {

    /**
     * Creates new form FrmDepartaments
     */
    public FrmDepartaments() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        txtForm = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnShowDepartaments = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDepartaments = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 51));
        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("DEPARTAMENTS");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Color:");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setText("Characteristics");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 153));
        jLabel4.setText("Size:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Stuctura");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 102));
        jLabel6.setText("Price:");

        cmbColor.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cmbColor.setForeground(new java.awt.Color(255, 0, 255));
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "Orange" }));

        txtForm.setBackground(new java.awt.Color(255, 255, 204));
        txtForm.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        txtForm.setCaretColor(new java.awt.Color(204, 255, 51));

        txtSize.setBackground(new java.awt.Color(204, 255, 204));

        txtAge.setBackground(new java.awt.Color(204, 255, 255));

        txtPrice.setBackground(new java.awt.Color(255, 204, 255));

        btnSave.setBackground(new java.awt.Color(204, 255, 204));
        btnSave.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 51, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnShowDepartaments.setBackground(new java.awt.Color(255, 255, 153));
        btnShowDepartaments.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnShowDepartaments.setForeground(new java.awt.Color(255, 51, 51));
        btnShowDepartaments.setText("SHOW DEPARTAMENT");
        btnShowDepartaments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDepartamentsActionPerformed(evt);
            }
        });

        txtAreaDepartaments.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaDepartaments.setColumns(20);
        txtAreaDepartaments.setRows(5);
        jScrollPane1.setViewportView(txtAreaDepartaments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnSave)
                        .addGap(84, 84, 84)
                        .addComponent(btnShowDepartaments))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbColor, 0, 164, Short.MAX_VALUE)
                                .addComponent(txtForm)
                                .addComponent(txtAge)
                                .addComponent(txtSize)
                                .addComponent(txtPrice)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnShowDepartaments))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Departament departament;
        String color;
        String characteristics;
        String stuctura;
        int size;
        int price;
        DepartamentController departamentController = new DepartamentController();
        
        color= cmbColor.getSelectedItem().toString();
        characteristics= txtForm.getText();
        stuctura= txtSize.getText();
        size= Integer.parseInt(txtAge.getText());
        price= Integer.parseInt(txtPrice.getText());
        
        departament = new Departament(color, characteristics, stuctura, size, price);
        
        departamentController.save(departament);
        
        JOptionPane.showMessageDialog(rootPane, departament.getColor());
        
                                  

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnShowDepartamentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDepartamentsActionPerformed
                                           
        DepartamentController departamentController = new DepartamentController();
        txtAreaDepartaments.setText(departamentController.read());
    
    }//GEN-LAST:event_btnShowDepartamentsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDepartaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDepartaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDepartaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDepartaments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDepartaments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowDepartaments;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtAreaDepartaments;
    private javax.swing.JTextField txtForm;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}