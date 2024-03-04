package com.yash.pms.view;

import java.awt.print.PrinterException;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.yash.pms.dao.PartnerDao;
import com.yash.pms.email.Emailer;
import com.yash.pms.email.PartnerUtil;
import com.yash.pms.model.Partner;




public class PartnerPrint extends javax.swing.JFrame {
    
    String id=PartnerSearch.idd;
   
    String mobile;
    String email;
    String fullName;
    
    String orgtype;
    String orgName;
    String resources;
    String address;
    String state;
    String city;
    String postalcode;
    
    /**
     * Creates new form GenerateBill
     */
    public PartnerPrint() {
        initComponents();
        connect();
        txtPartnerInfo.setText("\t\t-: Partner Details :-\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"**********************************************************************************\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Partner ID:- "+id+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Organization Details:- \n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Org Name:- "+orgName+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Type:- "+orgtype+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Resources:- "+resources+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"**********************************************************************************\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Contact Details:- \n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Name:- "+fullName+"\n");        
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Email:- "+email+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Mobile:- "+mobile+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Address Information Details:- \n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"Address 1"+address+"\n");        
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"State"+state+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"City"+city+"\t\tZipcode="+postalcode+"\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"**********************************************************************************\n");
        txtPartnerInfo.setText(txtPartnerInfo.getText()+"\t\t"+"                    Thank You.");
        
        prepareHtmlContent();
        }
    
    public void  prepareHtmlContent() {
    	txthtmlInfo.setText("<html><body>");
    	 txthtmlInfo.setText("<h1> Partner Details </h1>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"****************************************************************<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Partner ID:- "+id+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"<h3>Organization Details<h3>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Name:- "+orgName+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Type:- "+orgtype+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Resources:- "+resources+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"**********************************************************************************<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"<h3>Contact Details</h3>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Full Name:- "+fullName+"<br>");
         
         txthtmlInfo.setText(txthtmlInfo.getText()+"Email:- "+email+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Mobile:- "+mobile+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Address Information Details:- <br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"Address 1"+address+"<br>");        
         txthtmlInfo.setText(txthtmlInfo.getText()+"State"+state+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"City"+city+"\t\tZipcode="+postalcode+"<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"**********************************************************************************<br>");
         txthtmlInfo.setText(txthtmlInfo.getText()+"   Thank You.");
         txthtmlInfo.setText(txthtmlInfo.getText()+"</body></html>");
    }
    public void connect(){
        
        try {
            
            Partner p= PartnerDao.getPartnerById(id);
         
                
                fullName=p.getFullName();                
                orgtype=p.getOrgType();
                orgName=p.getOrgName();
                email=p.getEmail();
                mobile=p.getMobile();
                resources=p.getResources();
                address=p.getAddress();
                state=p.getState();
                city =p.getCity();
                postalcode=p.getZipCode();
                
            	
   
            
        
        } catch ( Exception ex) {
            Logger.getLogger(PartnerPrint.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPartnerInfo = new javax.swing.JTextArea();
        txthtmlInfo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jB_sendemail= new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPartnerInfo.setEditable(false);
        txtPartnerInfo.setColumns(20);
        txtPartnerInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPartnerInfo.setRows(5);
        txtPartnerInfo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPartnerInfoFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtPartnerInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 370));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_printActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));
        
        jB_sendemail.setBackground(new java.awt.Color(204, 0, 0));
        jB_sendemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jB_sendemail.setForeground(new java.awt.Color(255, 255, 255));
        jB_sendemail.setText("Send Email");
        jB_sendemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_emailActionPerformed(evt);
            }
        });
        getContentPane().add(jB_sendemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close-icon-s.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-kmk.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
      // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    private void txtPartnerInfoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPartnerInfoFocusLost
       // TODO add your handling code here:
    }//GEN-LAST:event_txtPartnerInfoFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jB_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            txtPartnerInfo.print();        // TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(PartnerPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jB_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        	 System.out.println("partner info::"+txthtmlInfo.getText());
        	 String sendEmail=JOptionPane.showInputDialog(this,"please enter the reciepient email ids seperated by ;");
        	 //prepare html text body
        	 if(sendEmail != null)
        	 Emailer.send(sendEmail, "partner details", txthtmlInfo.getText());
        	 
            
        } catch (Exception ex) {
            Logger.getLogger(PartnerPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(PartnerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartnerPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jB_sendemail;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPartnerInfo;
    private javax.swing.JTextArea txthtmlInfo;
    // End of variables declaration//GEN-END:variables
}
