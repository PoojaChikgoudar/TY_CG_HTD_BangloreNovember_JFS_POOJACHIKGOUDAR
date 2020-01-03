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

import com.capgemini.jdbc.bean.CustomerBean;
import com.capgemini.jdbc.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO{
	FileReader reader;
	Properties prop;
	ProductBean user;
	public  ProductDAOImpl() {
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
	public boolean modify(int productId,ProductBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updatequery")))
		{
				pstmt.setInt(2,productId);
				pstmt.setString(1,bean.getProductName());
				
				
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
	public boolean add(ProductBean user) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery")))
		{
			pstmt.setInt(1, user.getProductId());
			pstmt.setString(2, user.getProductName());
				
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
	public boolean delete(int productId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deletequery")))
		{
			pstmt.setInt(1,productId);
			
			
			
			
				
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
	public List<ProductBean> getAllProducts() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbUser")),
				(prop.getProperty("dbpassword")));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next())	{
				ProductBean product=new ProductBean();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				list.add(product);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}


}
