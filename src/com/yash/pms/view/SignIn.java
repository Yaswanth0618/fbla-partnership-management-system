package com.yash.pms.view;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.yash.pms.dao.UserDao;
import com.yash.pms.model.User;
import com.yash.pms.util.PartnerConstants;

public class SignIn extends javax.swing.JFrame {

	static SignIn signInScreen;

	int flag = 0;

	/**
	 * Creates new form SignIn
	 */
	public SignIn() {
		initComponents();
		txtemail.requestFocus();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jButton4 = new javax.swing.JButton();
		jPanel_signin = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		txtemail = new javax.swing.JTextField();
		txtpassword = new javax.swing.JPasswordField();
		jLabel2 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		lblemail = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		jL_logo_icon = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		setLocation(300, 200);
		if (null != ApplicationMain.initialScreen)
			ApplicationMain.initialScreen.setVisible(false);

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(PartnerConstants.IMG_CLOSE_PATH))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 0, 60, 40));

		jL_logo_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-kmk-s.png")));
		getContentPane().add(jL_logo_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 150, 150));

		jPanel_signin.setBackground(new java.awt.Color(51, 51, 51));
		jPanel_signin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanel_signin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("Sign in");
		jPanel_signin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 2, -1, -1));

		jButton2.setBackground(new java.awt.Color(255, 51, 51));
		jButton2.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("Sign Up Now");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel_signin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 183, -1, 32));

		jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabel1.setText("Email");
		jPanel_signin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 67, 80, 30));

		txtemail.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
		txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtemailKeyPressed(evt);
			}

			public void keyReleased(java.awt.event.KeyEvent evt) {
				txtemailKeyReleased(evt);
			}

			
		});
		jPanel_signin.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 62, 264, 41));

		txtpassword.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
		txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtpasswordKeyPressed(evt);
			}
		});
		jPanel_signin.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 109, 264, 40));

		jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabel2.setText("Password");
		jPanel_signin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 109, -1, 30));

		jButton3.setBackground(new java.awt.Color(255, 51, 51));
		jButton3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("Forgot Password");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel_signin.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 183, -1, 32));

		jButton1.setBackground(new java.awt.Color(255, 51, 51));
		jButton1.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Login");
		jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				jButton1MouseMoved(evt);
			}
		});
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton1MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton1MouseExited(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel_signin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 184, -1, 30));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/h.png"))); // NOI18N
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt);
			}
		});
		jPanel_signin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 36, 31));

		lblemail.setForeground(new java.awt.Color(255, 255, 0));
		jPanel_signin.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 39, 264, 14));

		getContentPane().add(jPanel_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 420, 230));

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-kmk.jpg"))); // NOI18N
		jLabel3.setBorder(null);
		getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if (txtemail.getText().equalsIgnoreCase("admin") && txtpassword.getText().equalsIgnoreCase("admin")) {
			new Admin().setVisible(true);
			dispose();
		} else {

			try {

				User user = UserDao.validateUser(txtemail.getText(), txtpassword.getText());
				if (user != null) {
					String uname = user.getName();
					new Home(uname).setVisible(true);
					if (null != SignIn.signInScreen)
						SignIn.signInScreen.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(this, "Incorrect Email ID or Password", "Incorrect",
							JOptionPane.WARNING_MESSAGE);
					txtemail.requestFocus();
				}
			} catch (Exception ex) {
				Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		int yes = JOptionPane.showConfirmDialog(this, "Are You Really Close this Application ?", "Exit",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (yes == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		Signup.signUpScreen = new Signup();
		Signup.signUpScreen.setVisible(true);
		SignIn.signInScreen.setVisible(false);

//dispose(); 
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		PassWord.paswordScreen = new PassWord();
		PassWord.paswordScreen.setVisible(true);
		SignIn.signInScreen.setVisible(false);

//dispose();// TODO add your handling code here:
	}// GEN-LAST:event_jButton3ActionPerformed

	private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtemailKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			txtpassword.requestFocus();
		} // TODO add your handling code here:
	}// GEN-LAST:event_txtemailKeyPressed

	private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtpasswordKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

			if (txtemail.getText().equalsIgnoreCase("admin") && txtpassword.getText().equalsIgnoreCase("admin")) {
				new Admin().setVisible(true);
				dispose();
			} else {

				try {

					User user = UserDao.validateUser(txtemail.getText(), txtpassword.getText());
					if (user != null) {
						String uname = user.getName();
						new Home(uname).setVisible(true);
						SignIn.signInScreen.setVisible(false);

					} else {
						JOptionPane.showMessageDialog(this, "Incorrect Email ID or Password", "Incorrect",
								JOptionPane.WARNING_MESSAGE);
						txtemail.requestFocus();
					}
				} catch (Exception ex) {
					Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
				}

			}

		} // TODO add your handling code here:
	}// GEN-LAST:event_txtpasswordKeyPressed

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel4MouseClicked

		if (flag == 0) {
			jLabel4.setIcon(new ImageIcon(getClass().getResource("/image/s.png")));
			flag = 1;
			txtpassword.setEchoChar((char) 0);
		} else {
			jLabel4.setIcon(new ImageIcon(getClass().getResource("/image/h.png")));
			flag = 0;
			txtpassword.setEchoChar('*');

		}

		// TODO add your handling code here:
	}// GEN-LAST:event_jLabel4MouseClicked

	private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseMoved
	}// GEN-LAST:event_jButton1MouseMoved

	private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseEntered
	}// GEN-LAST:event_jButton1MouseEntered

	private void jButton1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseExited
	}// GEN-LAST:event_jButton1MouseExited

	private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtemailKeyReleased
		txtemail.setText(txtemail.getText().toLowerCase());

		int a = txtemail.getText().indexOf('@');
		int b = txtemail.getText().length();

		if (a == -1) {
			lblemail.setText("Invalid Email id");
		} else if (b > a + 1) {
			String s = txtemail.getText();
			String[] splitString = s.split("@");
			if (splitString[1].equalsIgnoreCase("gmail.com") || splitString[1].equalsIgnoreCase("yahoo.com")) {
				lblemail.setText("");
				txtpassword.requestFocus();
			} else
				lblemail.setText("Invalid Email id");
		}
		if (txtemail.getText().equals(""))
			lblemail.setText("");

	}// GEN-LAST:event_txtemailKeyReleased

	

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			SignIn.signInScreen = new SignIn();
			SignIn.signInScreen.setVisible(true);
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel_signin;
	private javax.swing.JLabel lblemail;
	private javax.swing.JTextField txtemail;
	private javax.swing.JPasswordField txtpassword;
	private javax.swing.JLabel jL_logo_icon;
	// End of variables declaration//GEN-END:variables
}
