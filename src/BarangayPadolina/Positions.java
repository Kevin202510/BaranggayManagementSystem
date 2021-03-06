/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarangayPadolina;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Padolina Family
 */
public class Positions extends javax.swing.JFrame {

    /**
     * Creates new form BrgyPosition
     */
    public Positions() {
        initComponents();
        showPosition();
    }
    
        Connection testConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/barangay_padolina", "root", "");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public void clearPositionDescription(){
        jTxtFld_Positiondescription.setText("");
    }
    
    public void showPosition(){
        try {
            DefaultTableModel model = (DefaultTableModel)jTblPosition.getModel();
            Object[] posTable = new Object[9];
            String getAllBrgyPosition = "SELECT * FROM positions";
            Statement st = testConnection().createStatement();
            ResultSet rs = st.executeQuery(getAllBrgyPosition);
            
            while(rs.next()){
//                JOptionPane.showMessageDialog(this, rs.getInt("ID"));
                posTable[0] = rs.getInt("id");
                posTable[1] = rs.getString("position_descrip");
                model.addRow(posTable);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Puroks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void addPositions(){
   
        
        int rows = jTblPosition.getRowCount();
        int checker = 0;
        for (int rowNum=0; rowNum<rows; ++rowNum) {
            String pos = String.valueOf(jTblPosition.getValueAt(rowNum,1));
            if(jTxtFld_Positiondescription.getText().equalsIgnoreCase(pos)){
                checker = 1; 
                break;
            }
        }
        if(checker==1){
            JOptionPane.showMessageDialog(this, "Positon already assigned");
        }
        else if(jTxtFld_Positiondescription.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please Enter Positions In Text Field");
        }
        else{
           
        try {
            String insert = "INSERT INTO positions(position_descrip) VALUES (?)";
            PreparedStatement st = testConnection().prepareStatement(insert);
            st.setString(1, jTxtFld_Positiondescription.getText());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)jTblPosition.getModel();
                model.setRowCount(0);
                showPosition();
                clearPositionDescription();
            } else {
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Puroks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     }
    }     
    
    public void updatePositions(int ids){
   
        try {
            String insert = "UPDATE positions SET position_descrip = ? where id = ?";
            PreparedStatement st = testConnection().prepareStatement(insert);
            st.setString(1, jTxtFld_Positiondescription.getText());
            st.setInt(2,ids);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)jTblPosition.getModel();
                model.setRowCount(0);
                showPosition();
                clearPositionDescription();
            } else {
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Puroks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     }
    
    public void deletePositions(int ids){
    JOptionPane.showMessageDialog(this, ids);
        try {
            String insert = "DELETE FROM positions where id = ?";
            PreparedStatement st = testConnection().prepareStatement(insert);
            st.setInt(1,ids);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)jTblPosition.getModel();
                model.setRowCount(0);
                showPosition();
                clearPositionDescription();
            } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Puroks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblPosition = new javax.swing.JTable();
        jBttnAdd = new javax.swing.JButton();
        jBttnUpdate = new javax.swing.JButton();
        jTxtFld_Positiondescription = new javax.swing.JTextField();
        jBttnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jTblPosition.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTblPosition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PositionDescription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblPosition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblPositionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblPosition);

        jBttnAdd.setText("ADD");
        jBttnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnAddActionPerformed(evt);
            }
        });

        jBttnUpdate.setText("UPDATE");
        jBttnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnUpdateActionPerformed(evt);
            }
        });

        jTxtFld_Positiondescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFld_PositiondescriptionActionPerformed(evt);
            }
        });

        jBttnDelete.setText("DELETE");
        jBttnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Position");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrgyLogo/x-mark-2-16.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Positions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(333, 333, 333)
                                            .addComponent(jBttnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBttnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(75, 75, 75)
                                            .addComponent(jBttnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFld_Positiondescription, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFld_Positiondescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBttnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBttnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnAddActionPerformed
       addPositions();
    }//GEN-LAST:event_jBttnAddActionPerformed
    int id = 0;
    private void jTblPositionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblPositionMouseClicked
        id = Integer.parseInt(jTblPosition.getValueAt(jTblPosition.getSelectedRow(),0).toString());
        jTxtFld_Positiondescription.setText(jTblPosition.getValueAt(jTblPosition.getSelectedRow(),1).toString());
    }//GEN-LAST:event_jTblPositionMouseClicked

    private void jTxtFld_PositiondescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFld_PositiondescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFld_PositiondescriptionActionPerformed

    private void jBttnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnUpdateActionPerformed
        updatePositions(id);
    }//GEN-LAST:event_jBttnUpdateActionPerformed

    private void jBttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnDeleteActionPerformed
        deletePositions(id);
    }//GEN-LAST:event_jBttnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new BarangayDashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Positions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnAdd;
    private javax.swing.JButton jBttnDelete;
    private javax.swing.JButton jBttnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblPosition;
    private javax.swing.JTextField jTxtFld_Positiondescription;
    // End of variables declaration//GEN-END:variables

    private void clearPositiosDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
