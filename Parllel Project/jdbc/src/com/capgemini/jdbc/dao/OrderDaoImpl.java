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
import com.capgemini.jdbc.bean.OrderBean;

public class OrderDaoImpl implements OrderDao {
	FileReader reader;
	Properties prop;
	OrderBean order;
	public  OrderDaoImpl() {
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
	public List<OrderBean> getAllOrderDetails() {
		List<OrderBean> list=new ArrayList<OrderBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbUser")),
				(prop.getProperty("dbpassword")));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query3"))){
			while(rs.next())	{
				OrderBean order1=new OrderBean();
				order1.setOrderid(rs.getInt(1));
				order1.setCustomername(rs.getString(2));
				order1.setProductname(rs.getString(3));
				order1.setHauliername(rs.getString(4));
				order1.setDeliverydate(rs.getString(5));
				list.add(order1);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean add(OrderBean order) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery2")))
		{
			pstmt.setInt(1, order.getOrderid());;
			pstmt.setString(2, order.getCustomername());
			pstmt.setString(3,order.getProductname());
			pstmt.setString(4, order.getHauliername());
			
			pstmt.setString(5, order.getDeliverydate());
			
			
				
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
	public boolean modify(int orderid, OrderBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updatequery2")))
		{
				pstmt.setInt(5, orderid);
				pstmt.setString(1,bean.getCustomername());
				pstmt.setString(2,bean.getProductname());
				pstmt.setString(3,bean.getHauliername());
				pstmt.setString(4,bean.getDeliverydate());
				
				
				
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
	public boolean delete(int orderid) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deletequery2")))
		{
			pstmt.setInt(1,orderid);
			
			
			
			
				
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
