/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarangayPadolina;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 63926
 */
public class BrgyClearance extends javax.swing.JPanel {

    /**
     * Creates new form BrgyClearance
     */
    public BrgyClearance() {
        initComponents();
        jLabel26.setText(getDateNow());
        String Fullname = JOptionPane.showInputDialog(null,"Fullname");
        String Dob = JOptionPane.showInputDialog(null,"Dob");
        jLblPangalan0.setText(Fullname);
        jLblBirthday1.setText(Dob);
        jLblPangalan1.setText(Fullname);
        jLblPangalanatPirma0.setText(Fullname);
    }
    
    public String getDateNow(){
         Date jlbl_date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");  
        String strDate = dateFormat.format(jlbl_date);
        return strDate;
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlContent1 = new javax.swing.JPanel();
        jPnlTitle1 = new javax.swing.JPanel();
        jLblIcon1 = new javax.swing.JLabel();
        jLblIcon2 = new javax.swing.JLabel();
        jLblRepublic1 = new javax.swing.JLabel();
        jLblProvince1 = new javax.swing.JLabel();
        jLblMunicipal1 = new javax.swing.JLabel();
        jLblPadolinaTitle1 = new javax.swing.JLabel();
        jLblOffice = new javax.swing.JLabel();
        jPnlOfficials1 = new javax.swing.JPanel();
        jLblChairman1 = new javax.swing.JLabel();
        jLblKagawad0 = new javax.swing.JLabel();
        jLblKagawad1 = new javax.swing.JLabel();
        jLblKagawad2 = new javax.swing.JLabel();
        jLblKagawad3 = new javax.swing.JLabel();
        jLblKagawad4 = new javax.swing.JLabel();
        jLblKagawad5 = new javax.swing.JLabel();
        jLblKagawad6 = new javax.swing.JLabel();
        jLblSKchairwoman0 = new javax.swing.JLabel();
        jLblSecretary0 = new javax.swing.JLabel();
        jLablTreasures0 = new javax.swing.JLabel();
        jLblOffice1 = new javax.swing.JLabel();
        jLblPangalan0 = new javax.swing.JLabel();
        jLblPangalan1 = new javax.swing.JLabel();
        jLblBirthday1 = new javax.swing.JLabel();
        jLblPangalanatPirma0 = new javax.swing.JLabel();
        jLblTitleClearance0 = new javax.swing.JLabel();
        jLblFillup0 = new javax.swing.JLabel();
        jLblFillup1 = new javax.swing.JLabel();
        jLblPaalala = new javax.swing.JLabel();
        jLblPirmaAtPangalan0 = new javax.swing.JLabel();
        jLblCaptainPirma = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLblwatemark1 = new javax.swing.JLabel();

        jPnlContent1.setPreferredSize(new java.awt.Dimension(600, 700));
        jPnlContent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPnlTitle1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrgyLogo/output-onlinepngtools (2).png"))); // NOI18N
        jLblIcon1.setText("asdasd");
        jPnlTitle1.add(jLblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 106));

        jLblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrgyLogo/output-onlinepngtools (3).png"))); // NOI18N
        jLblIcon2.setText("jLabel1");
        jPnlTitle1.add(jLblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 100, 106));

        jLblRepublic1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLblRepublic1.setText("Republic of the Philippines");
        jPnlTitle1.add(jLblRepublic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 159, -1));

        jLblProvince1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLblProvince1.setText("Province of Nueva Ecija ");
        jPnlTitle1.add(jLblProvince1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLblMunicipal1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLblMunicipal1.setText("Municipality of General Tinio ");
        jPnlTitle1.add(jLblMunicipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLblPadolinaTitle1.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLblPadolinaTitle1.setText("<html> <p style=\"color:blue\"> Barangay Padolina </p> </html>");
        jPnlTitle1.add(jLblPadolinaTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 140, 30));

        jLblOffice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLblOffice.setText("OFFICE OF THE BARANGAY CHAIRMAN");
        jPnlTitle1.add(jLblOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 350, 30));

        jPnlContent1.add(jPnlTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 120));

        jPnlOfficials1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPnlOfficials1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblChairman1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblChairman1.setText("<html> <u style=\"color:blue\">Hon. Virgilio B, Domingo.</u><br> <center> Brgy Chairman </center> </br> </html>");
        jPnlOfficials1.add(jLblChairman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 54, -1, -1));

        jLblKagawad0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad0.setText("<html><u style=\"color:blue\"> Hon. Virgilio B, Custodio, Jr.</u> <br> <center> Kagawad </center> </br> </html>");
        jPnlOfficials1.add(jLblKagawad0, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 102, -1, -1));

        jLblKagawad1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad1.setText("<html><u style=\"color:blue\">Hon. Bernardo A. Manimbo. </u> <br> <center>Kagawad</center></br></html>");
        jPnlOfficials1.add(jLblKagawad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, -1, -1));

        jLblKagawad2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad2.setText("<html><u style=\"color:blue\">Hon. Lawrence B. Bote.</u><br><center>Kagawad</br></center></html>");
        jPnlOfficials1.add(jLblKagawad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 198, -1, -1));

        jLblKagawad3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad3.setText("<html><u style=\"color:blue\">Hon. Annie B. Lesmoras.</u><br><center>Kagawad</br></center></html>");
        jPnlOfficials1.add(jLblKagawad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 246, -1, -1));

        jLblKagawad4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad4.setText("<html><u style=\"color:blue\">Hon. Brigido B. Ramos. Jr.</u><br><center>Kagawad</br></center></html>");
        jPnlOfficials1.add(jLblKagawad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 294, -1, 34));

        jLblKagawad5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad5.setText("<html><u style=\"color:blue\">Hon. Niel M. Ramos.</u><br><center>Kagawad</br></center></html>");
        jPnlOfficials1.add(jLblKagawad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 350, -1, 26));

        jLblKagawad6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblKagawad6.setText("<html><u style=\"color:blue\">Hon. Nimfa Q. Barlis.</u><br><center>Kagawad</br></center></html>");
        jPnlOfficials1.add(jLblKagawad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 394, 130, -1));

        jLblSKchairwoman0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblSKchairwoman0.setText("<html><u style=\"color:blue\">Hon. Ela Mea B. Ramos.</u><br><center>SK ChairWoman</br></center></html>");
        jPnlOfficials1.add(jLblSKchairwoman0, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 442, -1, -1));

        jLblSecretary0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblSecretary0.setText("<html><u style=\"color:blue\">Fundaver M. Macariola.</u><br><center>Brgy. Secretary</br></center></html>");
        jPnlOfficials1.add(jLblSecretary0, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 490, -1, -1));

        jLablTreasures0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLablTreasures0.setText("<html><u style=\"color:blue\">Roselia M. Gonzales.</u><br><center>Brgy. Treasurer</br></center></html>");
        jPnlOfficials1.add(jLablTreasures0, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 531, 130, 40));

        jLblOffice1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLblOffice1.setText("<html>BARANGAY OFFICIALS <br><center>2018-2022</br></center></html>");
        jPnlOfficials1.add(jLblOffice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 9, -1, 34));

        jPnlContent1.add(jPnlOfficials1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, 570));
        jPnlContent1.add(jLblPangalan0, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 304, 150, 20));
        jPnlContent1.add(jLblPangalan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 190, 20));
        jPnlContent1.add(jLblBirthday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 140, 20));
        jPnlContent1.add(jLblPangalanatPirma0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 584, 190, 30));

        jLblTitleClearance0.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        jLblTitleClearance0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTitleClearance0.setText("BARANGAY   CLEARANCE");
        jPnlContent1.add(jLblTitleClearance0, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 280, 50));

        jLblFillup0.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLblFillup0.setText("<HTML>  TO WHOM IT MY CONCERN: <p> <BR><BR> This is to certify Mr/Ms:____________________, Born On,___________________,Single/Marries/Widow(er), And whose signature appears below, is a bonafide resident of Barangay Padolina, General Tinio, Nueva Ecija and is known to me to be a person of good moral character and reputation in this communinty...</p></html>");
        jPnlContent1.add(jLblFillup0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 460, 220));

        jLblFillup1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLblFillup1.setText("<html><p>This Certification is issued upon the request of Mr/Ms:_______________________, For whatever legal purpose it may serve best.</p></html>");
        jPnlContent1.add(jLblFillup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 470, 100));

        jLblPaalala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblPaalala.setText("<html><p style=\"color:red\"> This clearance is valid for 6 Months from date of issue and it's not valid without Dry Seal. </p> </html>");
        jPnlContent1.add(jLblPaalala, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 260, 50));

        jLblPirmaAtPangalan0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblPirmaAtPangalan0.setText("<html><br>____________________________</br> </br>Signature Over Printed Name.</html>");
        jPnlContent1.add(jLblPirmaAtPangalan0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 190, 80));

        jLblCaptainPirma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblCaptainPirma.setText("<html> <br><h3> Virgilio B. Domingo.</h3><center></br>Barangay Chairman</center></html>");
        jPnlContent1.add(jLblCaptainPirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 150, 80));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPnlContent1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 160, 30));

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPnlContent1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 640, -1));
        jPnlContent1.add(jLblwatemark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 220, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPnlContent1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPnlContent1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLablTreasures0;
    private javax.swing.JLabel jLblBirthday1;
    private javax.swing.JLabel jLblCaptainPirma;
    private javax.swing.JLabel jLblChairman1;
    private javax.swing.JLabel jLblFillup0;
    private javax.swing.JLabel jLblFillup1;
    private javax.swing.JLabel jLblIcon1;
    private javax.swing.JLabel jLblIcon2;
    private javax.swing.JLabel jLblKagawad0;
    private javax.swing.JLabel jLblKagawad1;
    private javax.swing.JLabel jLblKagawad2;
    private javax.swing.JLabel jLblKagawad3;
    private javax.swing.JLabel jLblKagawad4;
    private javax.swing.JLabel jLblKagawad5;
    private javax.swing.JLabel jLblKagawad6;
    private javax.swing.JLabel jLblMunicipal1;
    private javax.swing.JLabel jLblOffice;
    private javax.swing.JLabel jLblOffice1;
    private javax.swing.JLabel jLblPaalala;
    private javax.swing.JLabel jLblPadolinaTitle1;
    private javax.swing.JLabel jLblPangalan0;
    private javax.swing.JLabel jLblPangalan1;
    private javax.swing.JLabel jLblPangalanatPirma0;
    private javax.swing.JLabel jLblPirmaAtPangalan0;
    private javax.swing.JLabel jLblProvince1;
    private javax.swing.JLabel jLblRepublic1;
    private javax.swing.JLabel jLblSKchairwoman0;
    private javax.swing.JLabel jLblSecretary0;
    private javax.swing.JLabel jLblTitleClearance0;
    private javax.swing.JLabel jLblwatemark1;
    private javax.swing.JPanel jPnlContent1;
    private javax.swing.JPanel jPnlOfficials1;
    private javax.swing.JPanel jPnlTitle1;
    // End of variables declaration//GEN-END:variables
}