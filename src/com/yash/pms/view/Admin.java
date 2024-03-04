package com.yash.pms.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.yash.pms.util.PartnerConstants;

// Main class for Admin view
public class Admin extends javax.swing.JFrame {

    // Constructor
    public Admin() {
        initComponents(); // Initialize components
        s(); // Populate table with initial data
        txtemail.requestFocus(); // Set focus to email field
    }
    
    // Method to fetch data from database and populate the table
    public void s(){
        PreparedStatement pst=null;
        Statement st=null;
        ResultSet rs=null;
        Connection con=null;
        int q,i;
       
        try {
            // Establish database connection
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fbla_hms", "root", "kandra");
            pst=con.prepareStatement("Select * from signup"); // Fetch data from signup table
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel(); // Get table model
            RecordTable.setRowCount(0); // Reset table row count
            // Iterate through result set and populate table
            while(rs.next()){
                Vector<String> columnData=new Vector<String>();
                for(i=1;i<=q;i++){
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("password"));
                    columnData.add(rs.getString("sq"));
                    columnData.add(rs.getString("answer"));
                    columnData.add(rs.getString("status"));
                    
                }
                RecordTable.addRow(columnData); // Add row to table model
            }
            
            
        } catch (SQLException ex) {
            // Handle SQL exception
        }
    }

    // Method to initialize GUI components
    @SuppressWarnings("unchecked")
    private void initComponents() {
        // GUI component initialization code
    }

    // Action performed when close button is clicked
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new SignIn().setVisible(true); // Open SignIn window
    }                                         

    // Action performed when refresh button is clicked
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        s(); // Refresh table data
    }                                         

    // Action performed when search button is clicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(txtemail.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Record Not Found"); // Display error message if email field is empty
        }
        else{
            PreparedStatement pst=null;
            Statement st=null;
            ResultSet rs=null;
            Connection con=null;
            int q,i;
           
            try {
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fbla_hms", "root", "kandra"); // Establish connection
                pst=con.prepareStatement("Select * from signup where email=?"); // Fetch data based on email
                pst.setString(1,txtemail.getText());
                rs=pst.executeQuery();
                ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
                q=stData.getColumnCount();
                DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
                RecordTable.setRowCount(0); // Reset table row count
                // Populate table with search results
                while(rs.next()){
                    Vector<String> columnData=new Vector<String>();
                    for(i=1;i<=q;i++){
                        columnData.add(rs.getString("name"));
                        columnData.add(rs.getString("email"));
                        columnData.add(rs.getString("password"));
                        columnData.add(rs.getString("sq"));
                        columnData.add(rs.getString("answer"));
                        columnData.add(rs.getString("status"));
                        
                    }
                    RecordTable.addRow(columnData); // Add row to table model
                }
                
                
            } catch ( SQLException ex) {
                JOptionPane.showMessageDialog(this,"Record Not Found"); // Handle SQL exception
            }
        }   
    }                                         

    // Action performed when table row is double-clicked
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(evt.getClickCount()==2){
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel(); // Get table model
            int SelectedRows=jTable1.getSelectedRow();
            String ck=((String) RecordTable.getValueAt(SelectedRows,5)); // Get status value
            String email=((String) RecordTable.getValueAt(SelectedRows,1)); // Get email value
            if(ck.equalsIgnoreCase("panding")){
                // Ask user to change status if it's pending
                int yes=JOptionPane.showConfirmDialog(this,"Staus is panding ,do you want to change it");
                if(JOptionPane.YES_OPTION==yes){
                    PreparedStatement pst=null;
                    Connection con=null;
                    try {
                        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fbla_hms", "root", "kandra"); // Establish connection
                        pst = con.prepareStatement("update signup set status=? where email=?");
                        pst.setString(1, "approved");
                        pst.setString(2,email);
                        pst.executeUpdate(); // Execute update query
                        s(); // Refresh table data
                    }catch(Exception e){
                        
                    }         
                }
                
            }
            else{
                // Ask user to change status if it's approved
                int yes=JOptionPane.showConfirmDialog(this,"Staus is Approved ,do you want to change it");
                if(JOptionPane.YES_OPTION==yes){
                    if(JOptionPane.YES_OPTION==yes){
                        PreparedStatement pst=null;
                        Connection con=null;
                        try {
                            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fbla_hms", "root", "kandra"); // Establish connection
                            pst = con.prepareStatement("update signup set status=? where email=?");
                            pst.setString(1, "panding");
                            pst.setString(2,email);
                            pst.executeUpdate(); // Execute update query
                            s(); // Refresh table data
                        }catch(Exception e){
                            
                        }
                    }
                }
            }
        }     
    }                                      

    // Main method
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // GUI look and feel settings

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true); // Make Admin window visible
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtemail;
    // End of variables declaration                   
}
