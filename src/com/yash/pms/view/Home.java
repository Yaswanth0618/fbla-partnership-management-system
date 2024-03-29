package com.yash.pms.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import com.yash.pms.util.PartnerConstants;

// Home class represents the main interface of the application
public class Home extends javax.swing.JFrame {

	ManagePartner mp; // ManagePartner instance
	PartnerAddUpdate pd; // PartnerAddUpdate instance
	PartnerSearch ps; // PartnerSearch instance
	String uname; // Username of the user logged in
	
	/**
	 * Creates new form Home
	 */
	public Home(String uname) {
		this.uname=uname;
		initComponents(); // Initialize GUI components
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")

	private void initComponents() {

		// Initialize GUI components
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jb_partner = new javax.swing.JButton();
		jB_partnerSearch = new javax.swing.JButton();
		jb_mpartner = new javax.swing.JButton();
		jL_logo_icon = new javax.swing.JLabel();
		jL_welcome = new javax.swing.JLabel();

		// Set window properties
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		setLocation(300, 200);
		
		// Initialize jPanel1
		jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		// Set label for displaying the username
		jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 26));
		jLabel3.setForeground(new java.awt.Color(240, 240, 240));
		jLabel3.setText("Welcome "+uname);
		getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 396, 30));

		// Set label for welcome message
		jL_welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource(PartnerConstants.IMG_HOME_WELCOME_PATH)));
		getContentPane().add(jL_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1160, 570));	

		// Initialize and configure buttons for managing partners
		jb_mpartner.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
		jb_mpartner.setForeground(new java.awt.Color(0, 0, 204));
		jb_mpartner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage.png")));
		jb_mpartner.setText("Manage Partners");
		jb_mpartner.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_managePartnerActionPerformed(evt);
			}
		});
		getContentPane().add(jb_mpartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 200, 220, -1));

		// Initialize and configure buttons for adding partners
		jb_partner.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
		jb_partner.setForeground(new java.awt.Color(0, 0, 204));
		jb_partner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage.png")));
		jb_partner.setText("Add Partner");
		jb_partner.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_addPartnerActionPerformed(evt);
			}
		});
		getContentPane().add(jb_partner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 300, 220, -1));

		// Initialize and configure buttons for searching partners
		jB_partnerSearch.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
		jB_partnerSearch.setForeground(new java.awt.Color(0, 0, 204));
		jB_partnerSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bill.jpg")));
		jB_partnerSearch.setText("Partner Search");
		jB_partnerSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jB_PartnerSearchActionPerformed(evt);
			}
		});
		getContentPane().add(jB_partnerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 400, 220, -1));

		// Initialize and configure logout button
		jButton5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log out.jpg")));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 640, 200, -1));

		// Initialize and configure close button
		jButton6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12));
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(PartnerConstants.IMG_CLOSE_PATH)));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 0, 60, 40));

		// Set logo icon
		jL_logo_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource(PartnerConstants.IMG_LOGO_PATH)));
		getContentPane().add(jL_logo_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 150, 150));

		// Set background label
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(PartnerConstants.IMG_BG_PATH)));
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

		// Pack components
		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// Logout button action
		int yes = JOptionPane.showConfirmDialog(this, "Are you really Logout ?", "Logut", JOptionPane.YES_NO_OPTION);
		if (JOptionPane.YES_OPTION == yes) {
			new SignIn().setVisible(true);
		}
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		// Close button action
		int yes = JOptionPane.showConfirmDialog(this, "Are You Really Close This Application ?", "Exit",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (yes == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}// GEN-LAST:event_jButton6ActionPerformed

	private void jb_addPartnerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// Action when add partner button is clicked
		if(pd != null) pd.setVisible(false);
		pd=new PartnerAddUpdate();
		pd.setVisible(true);
		if(mp != null) mp.setVisible(false);
		if(ps != null) ps.setVisible(false);
		
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jb_managePartnerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// Action when manage partner button is clicked
		if(mp != null) mp.setVisible(false);
		mp=new ManagePartner();
		mp.setVisible(true);
		if(pd != null) pd.setVisible(false);
		if(ps != null) ps.setVisible(false);
		
	}
	
	private void jB_PartnerSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// Action when partner search button is clicked
		if(ps != null) ps.setVisible(false);
		ps=new PartnerSearch();
		ps.setVisible(true);
		if(mp != null) mp.setVisible(false);
		if(pd != null) pd.setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
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
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Home("").setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton jb_partner;
	private javax.swing.JButton jB_partnerSearch;
	private javax.swing.JButton jb_mpartner;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel jL_logo_icon;
	private javax.swing.JLabel jL_welcome;
	// End of variables declaration//GEN-END:variables
}
