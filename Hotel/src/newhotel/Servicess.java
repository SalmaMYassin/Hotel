/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newhotel;

/**
 *
 * @author Salma
 */
import javax.swing.*;
public class Servicess extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Servicess() {
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

        Name = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CheckAvailable = new javax.swing.JButton();
        BookARoom = new javax.swing.JButton();
        DeleteBooking = new javax.swing.JButton();
        Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Sitka Subheading", 2, 29)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Hotel Group 15");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, 50));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newhotel/hermes_logo.png"))); // NOI18N
        Logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 280, 120));

        jPanel1.setBackground(new java.awt.Color(56, 27, 27));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(698, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 910, 60));

        CheckAvailable.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        CheckAvailable.setForeground(new java.awt.Color(0, 153, 153));
        CheckAvailable.setText("Check Available Rooms");
        CheckAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAvailableActionPerformed(evt);
            }
        });

        BookARoom.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        BookARoom.setForeground(new java.awt.Color(0, 153, 153));
        BookARoom.setText("Book A Room ");
        BookARoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookARoomActionPerformed(evt);
            }
        });

        DeleteBooking.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        DeleteBooking.setForeground(new java.awt.Color(0, 153, 153));
        DeleteBooking.setText("Delete Booking");
        DeleteBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BookARoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(CheckAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookARoom, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 530, 350));

        Home.setBackground(new java.awt.Color(130, 97, 38));
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newhotel/home.jpg"))); // NOI18N
        Home.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                HomeAncestorResized(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1010, 719));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CheckAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAvailableActionPerformed
        new CheckAvaliableRooms().setVisible(true);
        dispose();
    }//GEN-LAST:event_CheckAvailableActionPerformed

    private void BookARoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookARoomActionPerformed
        new BookARoom().setVisible(true);
        dispose();
    }//GEN-LAST:event_BookARoomActionPerformed

    private void DeleteBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBookingActionPerformed
        new ModifyBooking().setVisible(true);
        dispose();
    }//GEN-LAST:event_DeleteBookingActionPerformed

    private void HomeAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_HomeAncestorResized
        Home.setSize(this.getWidth(), this.getHeight());
    }//GEN-LAST:event_HomeAncestorResized

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
            java.util.logging.Logger.getLogger(Servicess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookARoom;
    private javax.swing.JButton CheckAvailable;
    private javax.swing.JButton DeleteBooking;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Name;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
