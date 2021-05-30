/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarangayPadolina;

/**
 *
 * @author Aznable
 */
public class BrgyIndegencyForm extends javax.swing.JFrame {

    /**
     * Creates new form BrgyIndegencyForm
     */
    public BrgyIndegencyForm() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTxtFullN = new javax.swing.JTextField();
        jTxtAge = new javax.swing.JTextField();
        jBtnPrint = new javax.swing.JButton();
        jLblFullN = new javax.swing.JLabel();
        jLblAge = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrgyLogo/x-mark-2-16.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jTxtFullN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFullNActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtFullN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 260, 30));
        jPanel1.add(jTxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, 30));

        jBtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrgyLogo/printer-4-16.png"))); // NOI18N
        jBtnPrint.setText("Print");
        jBtnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 90, -1));

        jLblFullN.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLblFullN.setText("Fullname:");
        jPanel1.add(jLblFullN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 30));

        jLblAge.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLblAge.setText("Age:");
        jPanel1.add(jLblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 37));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Barangay Indigency Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new BarangayDashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTxtFullNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFullNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFullNActionPerformed

    private void jBtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(BrgyIndegencyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrgyIndegencyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrgyIndegencyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrgyIndegencyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrgyIndegencyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPrint;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblAge;
    private javax.swing.JLabel jLblFullN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtFullN;
    // End of variables declaration//GEN-END:variables
}