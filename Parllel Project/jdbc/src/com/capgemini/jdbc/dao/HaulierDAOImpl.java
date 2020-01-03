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


import com.capgemini.jdbc.bean.HaulierBean;

public class HaulierDAOImpl implements HaulierDao {
	FileReader reader;
	Properties prop;
	HaulierBean user;
	public  HaulierDAOImpl() {
		try {
			
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			
			
			
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<HaulierBean> getAllHaulier() {
		List<HaulierBean> list=new ArrayList<HaulierBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbUser")),
				(prop.getProperty("dbpassword")));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query2"))){
			while(rs.next())	{
				HaulierBean haulier=new HaulierBean();
				haulier.setHaulier_id(rs.getInt(1));
				haulier.setHaulier_name(rs.getString(2));
				haulier.setAdress(rs.getString(3));
				haulier.setEmail(rs.getString(4));
				haulier.setTelephone(rs.getLong(5));
				list.add(haulier);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}

		
		
		
		return null;
	}

	@Override
	public boolean add(HaulierBean user) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery1")))
		{
			pstmt.setInt(1, user.getHaulier_id());;
			pstmt.setString(2, user.getHaulier_name());
			pstmt.setString(3,user.getAdress());
			pstmt.setString(4, user.getEmail());
			
			pstmt.setLong(5, user.getTelephone());
			
			
				
				int count=pstmt.executeUpdate();
				
				if(count>0) {
					return true;
				}
				}catch(Exception e) {
					System.out.println("Primary key doesnot allow duplicates");
				}
		return false;
	}
		

	@Override
	public boolean modify(int haulier_id, HaulierBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updatequery1")))
		{
				pstmt.setInt(5, haulier_id);
				pstmt.setString(1,bean.getHaulier_name());
				pstmt.setString(2,bean.getAdress());
				pstmt.setString(3,bean.getEmail());
				pstmt.setLong(4,bean.getTelephone());
				
				
				
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
	public boolean deletehaulier(int haulier_id) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deletequery1")))
		{
			pstmt.setInt(1,haulier_id);
			
			
			
			
				
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
