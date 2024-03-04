package com.yash.pms.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.yash.pms.dao.PartnerDao;
import com.yash.pms.model.Partner;
import com.yash.pms.util.PartnerConstants;

public class ManagePartner extends javax.swing.JFrame {

	String s2;

	/**
	 * Creates new form ManageRoom
	 */
	public ManagePartner() {
		initComponents();
		loadTable();

	}

	public void loadTable() {

		try {
			List<Partner> partnerList = new ArrayList<Partner>();
			partnerList = PartnerDao.getAllPartners();
			// System.out.print(stData);
			int q = partnerList.size();
			DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
			// System.out.print(RecordTable);
			RecordTable.setRowCount(0);

			
			for (Partner p : partnerList) {
				Vector<String> columnData = new Vector<String>();
				for (int i = 1; i <= q; i++) {
				columnData.add(p.getPartnerId());
				columnData.add(p.getFullName());
				columnData.add(p.getOrgType());
				columnData.add(p.getOrgName());
				columnData.add(p.getResources());
				columnData.add(p.getMobile());
				columnData.add(p.getEmail());
				columnData.add(p.getAddress());
				columnData.add(p.getState());
				columnData.add(p.getCity());
				columnData.add(p.getZipCode());
			}
			RecordTable.addRow(columnData);
			// System.out.println(columnData);

		}}
		catch (Exception ex) {
		}
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jB_clear = new javax.swing.JButton();
		jB_close = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jB_add = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jB_search = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();

		jL_fname = new javax.swing.JLabel();
		jL_orgtype = new javax.swing.JLabel();
		jL_orgName = new javax.swing.JLabel();
		jL_mobile = new javax.swing.JLabel();
		jL_email = new javax.swing.JLabel();
		jL_address = new javax.swing.JLabel();
		jL_resource = new javax.swing.JLabel();
		jL_state = new javax.swing.JLabel();
		jL_city = new javax.swing.JLabel();
		jL_zipcode = new javax.swing.JLabel();
		jB_update = new javax.swing.JButton();
		jB_delete = new javax.swing.JButton();

		jL_searchOrg = new javax.swing.JLabel();
		jL_orgtype = new javax.swing.JLabel();
		jL_orgname = new javax.swing.JLabel();
		comboorgtype = new javax.swing.JComboBox<>();
		txtorgname = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		setLocation(300, 200);

		jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(240, 240, 240));
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage.png"))); // NOI18N
		jLabel1.setText("Manage Partner");
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

		jB_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close-icon-s.png"))); // NOI18N
		jB_close.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		getContentPane().add(jB_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 40, 40));

		jL_searchOrg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jL_searchOrg.setForeground(new java.awt.Color(255, 255, 255));
		jL_searchOrg.setText("Org Type ");
		getContentPane().add(jL_searchOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 230, -1));

		comboorgtype.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
		comboorgtype.setModel(new javax.swing.DefaultComboBoxModel<>(PartnerConstants.Orgtype));
		getContentPane().add(comboorgtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 150, -1));

		jL_orgname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jL_orgname.setForeground(new java.awt.Color(255, 255, 255));
		jL_orgname.setText("Org Name");
		getContentPane().add(jL_orgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 150, -1));

		txtorgname.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
		txtorgname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		getContentPane().add(txtorgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 18, 140, 35));

		jB_search.setBackground(new java.awt.Color(153, 0, 0));
		jB_search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jB_search.setForeground(new java.awt.Color(240, 240, 240));
		jB_search.setText("Search");
		jB_search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jB_SearchActionPerformed(evt);
			}
		});
		getContentPane().add(jB_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 100, 35));

		jB_clear.setBackground(new java.awt.Color(153, 0, 0));
		jB_clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		jB_clear.setForeground(new java.awt.Color(240, 240, 240));
		jB_clear.setText("Clear");
		jB_clear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jB_ClearActionPerformed(evt);
			}
		});
		getContentPane().add(jB_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 90, 35));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null } },
				new String[] { "Partner Id", "Contact Name", "Org Type", "Org name", "Resources", "Mobile Number",
						"Email", "Address", "State", "City", "zipcode" }
		//// first_name,last_name,org_type,org_name,email,mobile,resources,address1,state,city,postcode)"
		) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false, false, false,
					false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		jTable1.setAutoCreateRowSorter(true);
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1100, 370));

		// getContentPane().add(jScrollPane1, new
		// org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1120, 590));
		jL_fname.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_fname.setForeground(new java.awt.Color(240, 240, 240));
		jL_fname.setText("First Name");
		jL_fname.setVisible(false);
		getContentPane().add(jL_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 396, 30));

		jL_orgtype.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_orgtype.setForeground(new java.awt.Color(240, 240, 240));
		jL_orgtype.setText("Org Type");
		jL_orgtype.setVisible(false);
		getContentPane().add(jL_orgtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 396, 30));

		jL_orgName.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_orgName.setForeground(new java.awt.Color(240, 240, 240));
		jL_orgName.setText("Org Name");
		jL_orgName.setVisible(false);
		getContentPane().add(jL_orgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 396, 30));

		jL_resource.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_resource.setForeground(new java.awt.Color(240, 240, 240));
		jL_resource.setText("Resources");
		jL_resource.setVisible(false);
		getContentPane().add(jL_resource, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 396, 30));

		jL_email.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_email.setForeground(new java.awt.Color(240, 240, 240));
		jL_email.setText("Email");
		jL_email.setVisible(false);
		getContentPane().add(jL_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 396, 30));

		jL_mobile.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_mobile.setForeground(new java.awt.Color(240, 240, 240));
		jL_mobile.setText("Mobile");
		jL_mobile.setVisible(false);
		getContentPane().add(jL_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 396, 35));

		jL_address.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_address.setForeground(new java.awt.Color(240, 240, 240));
		jL_address.setText("Address");
		jL_address.setVisible(false);
		getContentPane().add(jL_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 396, 32));

		jL_state.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_state.setForeground(new java.awt.Color(240, 240, 240));
		jL_state.setText("State");
		jL_state.setVisible(false);
		getContentPane().add(jL_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 396, 33));

		jL_city.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_city.setForeground(new java.awt.Color(240, 240, 240));
		jL_city.setText("City");
		jL_city.setVisible(false);
		getContentPane().add(jL_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 396, 33));

		jL_zipcode.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jL_zipcode.setForeground(new java.awt.Color(240, 240, 240));
		jL_zipcode.setText("ZipCode");
		jL_zipcode.setVisible(false);
		getContentPane().add(jL_zipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 396, 33));

		jB_add.setBackground(new java.awt.Color(153, 0, 0));
		jB_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jB_add.setForeground(new java.awt.Color(240, 240, 240));
		jB_add.setText("Add");
		jB_add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jB_addActionPerformed(evt);
			}
		});
		getContentPane().add(jB_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 699, 120, 50));

		jB_update.setBackground(new java.awt.Color(153, 0, 0));
		jB_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jB_update.setForeground(new java.awt.Color(240, 240, 240));
		jB_update.setText("Update");
		jB_update.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jB_updateActionPerformed(evt);
			}
		});
		getContentPane().add(jB_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 699, 120, 50));

		jB_delete.setBackground(new java.awt.Color(153, 0, 0));
		jB_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jB_delete.setForeground(new java.awt.Color(240, 240, 240));
		jB_delete.setText("Delete");
		jB_delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jB_deleteActionPerformed(evt);
			}
		});
		getContentPane().add(jB_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 699, 120, 50));

		jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(240, 240, 240));
		jLabel7.setText("Select a row for update & Delete");

		getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 410, 32));

		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-kmk.jpg"))); // NOI18N
		getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jB_deleteActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel dmodel = (DefaultTableModel) jTable1.getModel();
		int rows = jTable1.getSelectedRow();
		if (rows == -1)
			JOptionPane.showMessageDialog(this, "Please Select a row for update");
		else {
			int result = JOptionPane.showConfirmDialog(this, "Sure? You want to Delete?", "Delete Partner",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				String partnerid = (String) dmodel.getValueAt(rows, 0);
				System.out.println("deleting the partner id:" + partnerid);

				
				try {
					PartnerDao.deletePartner(partnerid);
					loadTable();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("not deleted");
			}
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jB_SearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

		
		

		try {
			
			List<Partner> partnerList = new ArrayList<Partner>();
			partnerList = PartnerDao.getSearchPartners(comboorgtype.getItemAt(comboorgtype.getSelectedIndex()),txtorgname.getText());
			DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
			RecordTable.setRowCount(0);		
		
				int q = partnerList.size();
			
				// System.out.print(RecordTable);
				RecordTable.setRowCount(0);

				
				for (Partner p : partnerList) {
					Vector<String> columnData = new Vector<String>();
					for (int i = 1; i <= q; i++) {
					columnData.add(p.getPartnerId());
					columnData.add(p.getFullName());
					columnData.add(p.getOrgType());
					columnData.add(p.getOrgName());
					columnData.add(p.getResources());
					columnData.add(p.getMobile());
					columnData.add(p.getEmail());
					columnData.add(p.getAddress());
					columnData.add(p.getState());
					columnData.add(p.getCity());
					columnData.add(p.getZipCode());
				}
				RecordTable.addRow(columnData);
				// System.out.println(columnData);

			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Record Not Found.");
		}
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jB_ClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

		loadTable();
		comboorgtype.setSelectedIndex(0);
		txtorgname.setText("");
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jB_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		new PartnerAddUpdate().setVisible(true);
		setVisible(false);
	}

	private void jB_updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		DefaultTableModel dmodel = (DefaultTableModel) jTable1.getModel();
		
		int rows = jTable1.getSelectedRow();
		if (rows == -1)
			JOptionPane.showMessageDialog(this, "Please Select a row for update");
		
			
		
		
		String partner_id = (String) dmodel.getValueAt(rows, 0);
		System.out.println("Selected Partner Id for update::" + partner_id);
		if (rows == -1)
			JOptionPane.showMessageDialog(this, "Please Select a row for update");
		else {
			new PartnerAddUpdate(partner_id).setVisible(true);
			setVisible(false);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked

		jL_fname.setText("");
		jL_orgtype.setText("");
		jL_orgName.setText("");
		jL_resource.setText("");
		jL_address.setText("");
		jL_city.setText("");
		jL_state.setText("");
		jL_zipcode.setText("");
		jL_mobile.setText("");
		jL_email.setText("");
		DefaultTableModel dmodel = (DefaultTableModel) jTable1.getModel();
		int rows = jTable1.getSelectedRow();
		System.out.println("partner_id" + dmodel.getValueAt(rows, 0));
		// jL_prefix.setText(jL_prefix.getText()+" :
		// "+(String)dmodel.getValueAt(rows,1));
		jL_fname.setText("Full Name" + " : " + (String) dmodel.getValueAt(rows, 1));
		jL_orgtype.setText("Org Type" + " : " + (String) dmodel.getValueAt(rows, 2));
		jL_orgName.setText("Org Name" + " : " + (String) dmodel.getValueAt(rows, 3));
		jL_resource.setText("Resources" + " : " + (String) dmodel.getValueAt(rows, 4));
		jL_address.setText("Address" + " : " + (String) dmodel.getValueAt(rows, 6));
		jL_state.setText("State" + " : " + (String) dmodel.getValueAt(rows, 7));
		jL_city.setText("City" + " : " + (String) dmodel.getValueAt(rows, 8));
		jL_zipcode.setText("ZipCode" + " : " + (String) dmodel.getValueAt(rows, 9));
		setLabelVisible(true);

	}// GEN-LAST:event_jTable1MouseClicked

	private void setLabelVisible(boolean b) {
		// jL_prefix.setVisible(b);
		jL_fname.setVisible(b);
		jL_orgtype.setVisible(b);
		jL_orgName.setVisible(b);
		jL_resource.setVisible(b);
		jL_address.setVisible(b);
		jL_city.setVisible(b);
		jL_state.setVisible(b);
		jL_zipcode.setVisible(b);
		jL_mobile.setVisible(b);
		jL_email.setVisible(b);

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
			java.util.logging.Logger.getLogger(ManagePartner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ManagePartner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ManagePartner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ManagePartner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ManagePartner().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jB_close;
	private javax.swing.JButton jB_clear;
	private javax.swing.JButton jB_add;
	private javax.swing.JButton jB_search;
	private javax.swing.JButton jB_update;
	private javax.swing.JButton jB_delete;

	private javax.swing.JLabel jLabel1;

	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;

	private javax.swing.JLabel jL_fname;

	private javax.swing.JLabel jL_orgtype;
	private javax.swing.JLabel jL_orgName;

	private javax.swing.JLabel jL_resource;
	private javax.swing.JLabel jL_address;
	private javax.swing.JLabel jL_city;
	private javax.swing.JLabel jL_state;
	private javax.swing.JLabel jL_zipcode;

	private javax.swing.JLabel jL_mobile;
	private javax.swing.JLabel jL_email;

	private javax.swing.JTextField txtorgname;

	private javax.swing.JLabel jL_searchOrg;

	private javax.swing.JLabel jL_orgname;
	private javax.swing.JComboBox<String> comboorgtype;
}
