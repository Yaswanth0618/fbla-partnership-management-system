package com.yash.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.yash.pms.model.Partner;
import com.yash.pms.model.User;

public class PartnerDao {

	private static final String jdbcurl = "jdbc:mysql://127.0.0.1:3306/fbla_hms";
	private static final String db_user = "root";
	private static final String db_pwd = "kandra";

	public static List<Partner> getAllPartners() {
		PreparedStatement pst;
		ResultSet rs;
		List<Partner> partnerList = new ArrayList<Partner>();
		Partner p;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement("Select * from partner");
			rs = pst.executeQuery();
			while (rs.next()) {
				p = new Partner();
				p.setPartnerId(rs.getString("partnerid"));
				p.setFullName(rs.getString("full_name"));
				p.setOrgType(rs.getString("org_type"));
				p.setOrgName(rs.getString("org_name"));
				p.setResources(rs.getString("resources"));
				p.setMobile(rs.getString("mobile"));
				p.setEmail(rs.getString("email"));
				p.setAddress(rs.getString("address"));
				p.setState(rs.getString("state"));
				p.setCity(rs.getString("city"));
				p.setZipCode(rs.getString("postcode"));
				partnerList.add(p);
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return partnerList;
	}

	public static List<Partner> getSearchPartners(String type, String name) {
		PreparedStatement pst;
		ResultSet rs;
		List<Partner> partnerList = new ArrayList<Partner>();
		Partner p;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement("Select * from partner where org_type=? AND org_name like ?");
			if (type.equalsIgnoreCase("Any")) {
				pst = con.prepareStatement("Select * from partner where  org_name like ?");
				pst.setString(1, name + "%");
			} else {

				pst.setString(1, type);
				pst.setString(2, name + "%");
			}
			rs = pst.executeQuery();
			while (rs.next()) {
				p = new Partner();
				p.setPartnerId(rs.getString("partnerid"));
				p.setFullName(rs.getString("full_name"));
				p.setOrgType(rs.getString("org_type"));
				p.setOrgName(rs.getString("org_name"));
				p.setResources(rs.getString("resources"));
				p.setMobile(rs.getString("mobile"));
				p.setEmail(rs.getString("email"));
				p.setAddress(rs.getString("address"));
				p.setState(rs.getString("state"));
				p.setCity(rs.getString("city"));
				p.setZipCode(rs.getString("postcode"));
				partnerList.add(p);
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return partnerList;
	}
	
	public static Partner getPartnerById(String partnerId) {
		PreparedStatement pst;
		ResultSet rs;		
		Partner p=null;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement("Select * from partner where partnerid=?");
		
			pst.setString(1, partnerId);			
			rs = pst.executeQuery();
			while (rs.next()) {
				p = new Partner();
				p.setPartnerId(rs.getString("partnerid"));
				p.setFullName(rs.getString("full_name"));
				p.setOrgType(rs.getString("org_type"));
				p.setOrgName(rs.getString("org_name"));
				p.setResources(rs.getString("resources"));
				p.setMobile(rs.getString("mobile"));
				p.setEmail(rs.getString("email"));
				p.setAddress(rs.getString("address"));
				p.setState(rs.getString("state"));
				p.setCity(rs.getString("city"));
				p.setZipCode(rs.getString("postcode"));
				
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return p;
	}
	
	public static boolean checkPartnerAlreadyExist(String fullName,String orgType,String orgName) {
		PreparedStatement pst;
		ResultSet rs;		
		Partner p=null;
		boolean partnerFound=false;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement("select * from partner where full_name=? and org_type=? and org_name=?");
			pst.setString(1, fullName);
			pst.setString(2, orgType);
			pst.setString(3, orgName);		
			rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Partner Data Found");
				return true;
				
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return partnerFound;
	}
	
	public static int createPartner(String full_name,String org_type,String org_name,String email,String mobile,
			String resources,String address,String state,String city,String postcode) {
		PreparedStatement pst;
		ResultSet rs;
		int count = -1;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement(
					"insert into partner(full_name,org_type,org_name,email,mobile,resources,address,state,city,postcode)"
							+ "values(?,?,?,?,?,?,?,?,?,?)");

			pst.setString(1, full_name);
			pst.setString(2, org_type);
			pst.setString(3, org_name);
			pst.setString(4, email);
			pst.setString(5, mobile);
			pst.setString(6, resources);
			pst.setString(7, address);
			pst.setString(8, state);
			pst.setString(9, city);
			pst.setString(10, postcode);
			System.out.println("before adding partner");
			pst.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return count;
	}
	
	public static int updatePartner(String full_name,String org_type,String org_name,String email,String mobile,
			String resources,String address,String state,String city,String postcode,String partnerId) {
		PreparedStatement pst;
		ResultSet rs;
		int count = -1;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement(
					"update partner set full_name=?, org_type=?, org_name=?, email=?, mobile=?, resources =?, address= ?, state= ?, city=?, postcode=? where partnerid=?");
							

			pst.setString(1, full_name);
			pst.setString(2, org_type);
			pst.setString(3, org_name);
			pst.setString(4, email);
			pst.setString(5, mobile);
			pst.setString(6, resources);
			pst.setString(7, address);
			pst.setString(8, state);
			pst.setString(9, city);
			pst.setString(10, postcode);
			pst.setString(11, partnerId);
			System.out.println("before updating partner");
			pst.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return count;
	}

	public static int deletePartner(String partnerId) {
		PreparedStatement pst;
		ResultSet rs;
		int count = -1;
		try {

			Connection con = DriverManager.getConnection(jdbcurl, db_user, db_pwd);
			pst = con.prepareStatement("delete from partner where partnerid=?");

			pst.setString(1, partnerId);

			count = pst.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return count;
	}

}
