/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

/**
 *
 * @author Mai
 */
import javax.swing.*;
import java.awt.*;
import newhotel.*;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public Register() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Lname = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        Fname = new javax.swing.JLabel();
        Ssn = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        Mobile = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRATION");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        Lname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Lname.setText("Last Name:");

        Username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Username.setText("Username:");

        Password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Password.setText("Password:");

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        Register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 102, 255));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Fname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Fname.setText("First Name:");

        Ssn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ssn.setText("Ssn:");

        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setText("Address:");

        Mobile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Mobile.setText("Mobile");

        Email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Email.setText("Email: ");

        DOB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DOB.setText("Date of Birth: ");

        Return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Return.setForeground(new java.awt.Color(0, 102, 255));
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Lname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Register, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Fname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Ssn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Add, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Mobile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ssn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(add, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mobile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(DOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(dob, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Return, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Return)
                        .addGap(18, 18, 18)
                        .addComponent(Register))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Mobile)
                        .addGap(85, 85, 85)
                        .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Add)
                        .addGap(72, 72, 72)
                        .addComponent(add))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(DOB)
                        .addGap(36, 36, 36)
                        .addComponent(dob))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Ssn)
                        .addGap(99, 99, 99)
                        .addComponent(ssn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fname)
                            .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lname)
                            .addComponent(fname)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Email)
                        .addGap(82, 82, 82)
                        .addComponent(email))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(password))))
                .addGap(39, 39, 39))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fname)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email))
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ssn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOB)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mobile)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register)
                    .addComponent(Return))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
       Account a = new Account();
        String Fname = fname.getText();
       String Lname = lname.getText();
       String Username = username.getText();
       String Password = password.getText();
       String Email = email.getText();
       String Dob = dob.getText();
       String Ssn = ssn.getText();
       String Add = add.getText();
       String Mobile = mobile.getText();
       if(a.checkUsername(Username)){
           JOptionPane.showMessageDialog(null, "Username Already Exists, please choose another one","Username Already exists", JOptionPane.ERROR_MESSAGE);
       }
       else{
           a.Register(Username, Password, Fname, Lname, Ssn, Dob, Add, Mobile, Email);
           JOptionPane.showMessageDialog(null, "Registration Completed!","Success", JOptionPane.PLAIN_MESSAGE);

           this.setVisible(false);
           new Servicess().setVisible(true);
       }
    }//GEN-LAST:event_RegisterActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnActionPerformed

  
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Mobile;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Register;
    private javax.swing.JButton Return;
    private javax.swing.JLabel Ssn;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField add;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
