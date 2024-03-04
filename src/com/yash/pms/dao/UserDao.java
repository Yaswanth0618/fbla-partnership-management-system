package com.yash.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.yash.pms.model.User;
import com.yash.pms.view.SignIn;

public class UserDao {
	
	private static final String jdbcurl="jdbc:mysql://127.0.0.1:3306/fbla_hms";
	private static final String db_user="root";
	private static final String db_pwd="kandra";
	
	

	
	public static User validateUser(String email,String pwd){
		PreparedStatement pst;
		ResultSet rs;
		User user=null;
		try {
			
			Connection con  = DriverManager.getConnection(jdbcurl,db_user,db_pwd);
			pst = con.prepareStatement("select * from signup where email=? AND password=?");
			pst.setString(1, email);
			pst.setString(2, pwd);
			rs = pst.executeQuery();
			if (rs.next()) {
				user=new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));			

			} else {
				user=null;
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return user;
	}
	
	public static boolean CheckeEmailExist(String email){
		PreparedStatement pst;
		ResultSet rs;		
		try {
			
			Connection con  = DriverManager.getConnection(jdbcurl,db_user,db_pwd);
			pst = con.prepareStatement("select * from signup where email=? ");
			pst.setString(1, email);			
			rs = pst.executeQuery();
			if (rs.next()) {
			return true;	

			} else {
				return false;
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	public static User getUserByEmail(String email){
		PreparedStatement pst;
		ResultSet rs;
		User user=null;
		try {
			
			Connection con  = DriverManager.getConnection(jdbcurl,db_user,db_pwd);
			pst = con.prepareStatement("select * from signup where email=? ");
			pst.setString(1, email);			
			rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("name"));
				user=new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));	
				user.setSq(rs.getString("sq"));	
				user.setAnswer(rs.getString("answer"));	

			} else {
				user=null;
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("user anser:"+user.getAnswer());
		return user;
	}
	
	public static int createUser(String uname,String email,String pwd,String sq,String answer){
		PreparedStatement pst;
		ResultSet rs;		
		int count=-1;
		try {
			
			Connection con  = DriverManager.getConnection(jdbcurl,db_user,db_pwd);
			 pst=con.prepareStatement("insert into signup(name,email,password,sq,answer, status)values(?,?,?,?,?,?)");
			 pst.setString(1, uname);
	            pst.setString(2, email);
	            pst.setString(3, pwd);
	            pst.setString(4, sq);
	            pst.setString(5, answer);
	            pst.setString(6, "pending");
	            count=pst.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return count;
	}



}
