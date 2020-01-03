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

import com.capgemini.jdbc.bean.AdminBean;
import com.capgemini.jdbc.bean.ClientBean;


public class ClientDaoImpl implements ClientDao {
	FileReader reader;
	Properties prop;
	ClientBean client;
	public ClientDaoImpl() {
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
	public List<ClientBean> getAllClients() {
		List<ClientBean> list=new ArrayList<ClientBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbUser")),
				(prop.getProperty("dbpassword")));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query5"))){
			while(rs.next())	{
				ClientBean bean=new ClientBean();
				bean.setClientid(rs.getInt(1));
				bean.setClientName(rs.getString(2));
				bean.setPassword(rs.getString(3));
				list.add(bean);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	
	}

	@Override
	public boolean add(ClientBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertclient")))
		{
			pstmt.setInt(1, bean.getClientid());
			pstmt.setString(2, bean.getClientName());
			pstmt.setString(3, bean.getPassword());
				
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
	public boolean modify(int clientId, ClientBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateclient")))
		{
				pstmt.setInt(3,clientId);
				pstmt.setString(1,bean.getClientName());
				pstmt.setString(2,bean.getPassword());
				
				
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
	public boolean delete(int clientId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteclient")))
		{
			pstmt.setInt(1,clientId);
			
			
			
			
				
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
	public ClientBean clientLogin(String clientname, String password) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("clientlogin")))
		{
			
			pstmt.setString(1,clientname);
			pstmt.setString(2,password);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				client=new ClientBean();
				client.setClientid(rs.getInt(1));
				client.setClientName(rs.getString(2));
				client.setPassword(rs.getString(3));
			}
			return client;
		
			
			}catch(Exception e) {
			 e.printStackTrace();
			}
		return null;
	}

}
