package com.capgemini.appdevelopment.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.Connection;

import com.capgemini.appdevelopment.bean.Contact;



public class ContactDAOImpl implements ContactDAO {
	FileReader reader;
	Properties prop;
	public ContactDAOImpl() {
		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverclass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	@Override
	public List<Contact> getAllContact() {
		
			List<Contact> list=new ArrayList<Contact>();
			try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbuser")),
					(prop.getProperty("dbpassword")));
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
				while(rs.next())	{
					Contact contact=new Contact();
					 contact.setName(rs.getString(1));
					 contact.setNumber(rs.getLong(2));
					 contact.setGroup1(rs.getString(3));
					 list.add(contact);
				}
				return list;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		return null;
	}
	@Override
	public boolean insert(Contact contact) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertquery")))
		{
			
			pstmt.setString(1, contact.getName());
			pstmt.setLong(2,contact.getNumber());
			pstmt.setString(3,contact.getGroup1());
			
				
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
	public boolean delete(String name) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deletequery")))
		{
			pstmt.setString(1, name);
			
			
			
			
				
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
	public boolean update(String name,Contact contact) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updatequery")))
		{
				
				pstmt.setString(3, name);
				pstmt.setString(2,contact.getGroup1());
				pstmt.setLong(1, contact.getNumber());
				
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
