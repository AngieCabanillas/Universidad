/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules.ModuleMain;

import Connection.BD;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author FANNY BELTRAN
 */
public class ModuleMain extends javax.swing.JFrame {

    /**
     * Creates new form ModuleMain
     */
    public ModuleMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        btn_create = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        jTextField3.setText("jTextField1");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Delete user");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumnos de la Universidad Privada Antenor Orrego");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Code:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("LastName:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Phone:");

        txt_code.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_create.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_create.setText("Create user");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_update.setText("Update user");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete.setText("Delete user");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clear.setText("Clear fields");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                380, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn_clear,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn_delete,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn_update,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btn_create, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                117, Short.MAX_VALUE)
                                                                        .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_code)
                                                                        .addComponent(txt_name,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(txt_lastname)
                                                                        .addComponent(txt_phone))))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    BD bd = new BD();

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_createActionPerformed
        // TODO add your handling code here:

        String code = txt_code.getText();
        String name = txt_name.getText();
        String lastname = txt_lastname.getText();
        String phone = txt_phone.getText();

        try {
            PreparedStatement ps = null;
            ps = bd.getConexion().prepareStatement("INSERT INTO `users` VALUES (?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, code);
            ps.setString(3, name);
            ps.setString(4, lastname);
            ps.setString(5, phone);
            ps.executeUpdate();
            ps.close();

            btn_clear.doClick();

            JOptionPane.showMessageDialog(null, "Created user");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }// GEN-LAST:event_btn_createActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
        String code = txt_code.getText();
        String name = txt_name.getText();
        String lastname = txt_lastname.getText();
        String phone = txt_phone.getText();
        
        try {
            PreparedStatement ps = null;
            ps = bd.getConexion().prepareStatement("UPDATE `users` SET name=?, lastname=?, phone=? WHERE code=?");
            ps.setString(1, name);
            ps.setString(2, lastname);
            ps.setString(3, phone);
            ps.setString(4, code);
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Updated user");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }// GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        
        String code = txt_code.getText();
        
        try {
            PreparedStatement ps = null;
            ps = bd.getConexion().prepareStatement("DELETE FROM users WHERE code=?");
            ps.setString(1, code);
            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Deleted user");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }// GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:

        txt_code.setText("");
        txt_name.setText("");
        txt_lastname.setText("");
        txt_phone.setText("");
    }// GEN-LAST:event_btn_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModuleMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuleMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuleMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuleMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuleMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
