package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.capgemini.jdbc.bean.AdminBean;

public class AdminDAOImpl implements AdminDAO {
	FileReader reader;
	Properties prop;
	AdminBean admin;
	public  AdminDAOImpl() {
		try {
			
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public AdminBean adminLogin(String name, String password) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("adminlogin")))
		{
			
			pstmt.setString(1,name);
			pstmt.setString(2,password);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				admin=new AdminBean();
				admin.setName(rs.getString(1));
				admin.setEmail(rs.getString(2));
				admin.setPassword(rs.getString(3));
			}
			return admin;
		
			
			}catch(Exception e) {
			 e.printStackTrace();
			}
	

		return null;
	}

	@Override
	public boolean signUp(AdminBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("adminsignUp")))
		{
			pstmt.setString(1, bean.getName());
			pstmt.setString(2,bean.getEmail());
			pstmt.setString(3, bean.getPassword());
			int count=pstmt.executeUpdate();
			
			if(count>0) {
				return true;
			}
			}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
		
		return false;
	}

	
}
