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


import com.capgemini.jdbc.bean.LandBean;

public class LandDAOImpl implements LandDAO{
	FileReader reader;
	Properties prop;
	LandBean land;
	public  LandDAOImpl() {
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
	public List<LandBean> getAllLandDetails() {
		List<LandBean> list=new ArrayList<LandBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbUser")),
				(prop.getProperty("dbpassword")));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query4"))){
			while(rs.next())	{
				LandBean land=new LandBean();
				land.setLandId(rs.getInt(1));
				
				land.setLandlocation(rs.getString(2));
				land.setLandOwner(rs.getString(3));
				
				list.add(land);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean delete(int landId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteLand")))
		{
			pstmt.setInt(1,landId);
			
			
			
			
				
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
	public boolean add(LandBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertLand")))
		{
			pstmt.setInt(1, bean.getLandId());
			
			pstmt.setString(2,bean.getLandlocation());
			pstmt.setString(3,bean.getLandOwner());
			
			
			
			
				
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
	public boolean modify(int landId,LandBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateland")))
		{
				pstmt.setInt(3, landId);
				
				pstmt.setString(1,bean.getLandlocation());
				pstmt.setString(2,bean.getLandOwner());
				
				
				
				
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
