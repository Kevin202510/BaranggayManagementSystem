/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarangayPadolina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 63926
 */
public class Blotters extends javax.swing.JFrame {

    /**
     * Creates new form Blotters
     */
    public Blotters() {
        initComponents();
        showBlotters();
        jTxtMaidenName.setText(getDateNow());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnAdd = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtarea_breport = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtFName = new javax.swing.JTextField();
        jTxtMaidenName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_blotter = new javax.swing.JTable();
        jdate_of_hearing = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnAdd.setText("Add");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 170, 30));

        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 170, 30));

        jtxtarea_breport.setColumns(10);
        jtxtarea_breport.setLineWrap(true);
        jtxtarea_breport.setRows(5);
        jtxtarea_breport.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtxtarea_breport);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 980, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("                        BLOTTER/REPORT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 236, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Complainant:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Date of Report:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 90, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Date of Hearing:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 100, 30));

        jTxtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, 30));

        jTxtMaidenName.setEditable(false);
        jPanel1.add(jTxtMaidenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 160, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("BLOTTER REPORT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 210, 30));

        jtbl_blotter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Blotter Report", "Complainant", "Date of Report", "Date of Hearing", "Hearing Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_blotter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_blotterMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl_blotter);
        if (jtbl_blotter.getColumnModel().getColumnCount() > 0) {
            jtbl_blotter.getColumnModel().getColumn(0).setMinWidth(35);
            jtbl_blotter.getColumnModel().getColumn(0).setPreferredWidth(35);
            jtbl_blotter.getColumnModel().getColumn(0).setMaxWidth(35);
            jtbl_blotter.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 980, 270));
        jPanel1.add(jdate_of_hearing, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    SqlConnection getDBConn = new SqlConnection();
    Connection connection = getDBConn.DbconnectP();
    
    public void showBlotters(){
    try {
        DefaultTableModel model = (DefaultTableModel)jtbl_blotter.getModel();
        Object[] rows = new Object[6];
        String LoginQuery = "SELECT * FROM blotter";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(LoginQuery);
        String gender;
        
        while(rs.next()){
            rows[0] = rs.getInt("id");
            rows[1] = rs.getString("blotter_report");
            rows[2] = rs.getString("complainant");
            rows[3] = rs.getString("date_of_report");
            rows[4] = rs.getString("date_of_hearing");
            rows[5] = rs.getInt("hearing_count");
            model.addRow(rows);
            
        }
        
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Residence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }
    
    public String getDateNow(){
         Date jlbl_date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = dateFormat.format(jlbl_date);
        return strDate;
     }
    
     private void addResident(){
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
    String strDate = dateFormat.format(jdate_of_hearing.getDate());
    try {
        String addresident = "INSERT INTO `blotter` (`blotter_report`, `complainant`, `date_of_report`, `date_of_hearing`) VALUES (?,?,?,?);";
        PreparedStatement st = connection.prepareStatement(addresident);
        st.setString(1, jtxtarea_breport.getText());
        st.setString(2, jTxtFName.getText());
        st.setString(3, getDateNow());
        st.setString(4, strDate);
        int i = st.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(this,"Successfully Added");
            clearFilled();
            DefaultTableModel mod = (DefaultTableModel)jtbl_blotter.getModel();
            mod.setRowCount(0);
            showBlotters();
            
        } else {
            JOptionPane.showMessageDialog(this,"Error");
        }
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Residence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }
     
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new BarangayDashboard().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jTxtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFNameActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
       addResident();
    }//GEN-LAST:event_jBtnAddActionPerformed
    int id;
    private void jtbl_blotterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_blotterMouseClicked
        try {
            id = Integer.parseInt(jtbl_blotter.getValueAt(jtbl_blotter.getSelectedRow(),0).toString());
            jtxtarea_breport.setText(jtbl_blotter.getValueAt(jtbl_blotter.getSelectedRow(),1).toString());
            jTxtFName.setText(jtbl_blotter.getValueAt(jtbl_blotter.getSelectedRow(),2).toString());
            jTxtMaidenName.setText(jtbl_blotter.getValueAt(jtbl_blotter.getSelectedRow(),3).toString());
            String dateHearing = jtbl_blotter.getValueAt(jtbl_blotter.getSelectedRow(),4).toString();
            Date doh = new SimpleDateFormat("yyyy-MM-dd").parse(dateHearing);
            jdate_of_hearing.setDate(doh);
        } catch (ParseException ex) {
            Logger.getLogger(Blotters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbl_blotterMouseClicked

    private void clearFilled(){
        jtxtarea_breport.setText("");
        jTxtFName.setText("");
        jTxtMaidenName.setText("");
        jdate_of_hearing.setDate(null);
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
            java.util.logging.Logger.getLogger(Blotters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blotters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blotters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blotters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blotters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtFName;
    private javax.swing.JTextField jTxtMaidenName;
    private com.toedter.calendar.JDateChooser jdate_of_hearing;
    private javax.swing.JTable jtbl_blotter;
    private javax.swing.JTextArea jtxtarea_breport;
    // End of variables declaration//GEN-END:variables
}