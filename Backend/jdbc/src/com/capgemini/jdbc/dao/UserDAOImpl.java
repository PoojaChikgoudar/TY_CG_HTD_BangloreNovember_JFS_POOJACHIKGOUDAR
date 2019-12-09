package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.bean.UserBean;

public class UserDAOImpl implements UserDAO {
	FileReader reader;
	Properties prop;
	UserBean user;
	public  UserDAOImpl() {
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
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		List<UserBean> list=new ArrayList<UserBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next())	{
				 user=new UserBean();
				 user.setUser_id(rs.getInt(1));
				 user.setUsername(rs.getString(2));
				 user.setUsermail(rs.getString(3));
				 list.add(user);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserBean userLogin(String username, String password) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("loginquery")))
		{
			pstmt.setString(1, username);
			
			pstmt.setString(2, password);
			
				
	ResultSet rs=pstmt.executeQuery();
				
				while(rs.next()) {
					user=new UserBean();
					user.setUser_id(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setUsermail(rs.getString(3));
					
				}
				return user;
				}catch(Exception e) {
					e.printStackTrace();
				}
		return null;
	}

	@Override
	public boolean updateUser(UserBean user) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updatequery")))
		{
				pstmt.setInt(2, user.getUser_id());
				
				pstmt.setString(1,user.getUsermail());
				pstmt.setString(3, user.getPassword());
				
				int count=pstmt.executeUpdate();
				
				if(count>0) {
					return true;
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
		return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery")))
		{
			pstmt.setInt(1, user.getUser_id());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3,user.getUsermail());
			pstmt.setString(4, user.getPassword());
			
				
				int count=pstmt.executeUpdate();
				
				if(count>0) {
					return true;
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
		return false;
	}

	@Override
	public boolean deleteUser(UserBean user) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deletequery")))
		{
			pstmt.setInt(1, user.getUser_id());
			
			
			pstmt.setString(2, user.getPassword());
			
				
				int count=pstmt.executeUpdate();
				
				if(count>0) {
					return true;
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
		return false;
	
	}
}
