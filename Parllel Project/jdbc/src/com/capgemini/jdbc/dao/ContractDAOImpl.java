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

import com.capgemini.jdbc.bean.ContractBean;
import com.capgemini.jdbc.bean.CustomerBean;
import com.capgemini.jdbc.bean.ProductBean;

public class ContractDAOImpl implements ContractDAO {
	FileReader reader;
	Properties prop;
	CustomerBean user;
	public ContractDAOImpl() {
		try {
			
			reader=new FileReader("Contract.properties");
			prop=new Properties();
			prop.load(reader);
			
			
			
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<ContractBean> getAllContracts() {

		List<ContractBean> list=new ArrayList<ContractBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),(prop.getProperty("dbUser")),
				(prop.getProperty("dbpassword")));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next())	{
				ContractBean contract=new ContractBean();
				contract.setContractNo(rs.getInt(1));
				contract.setCustomerId(rs.getInt(2));
				contract.setProductId(rs.getInt(3));
				contract.setHaulierId(rs.getInt(4));
				contract.setDeliveryDate(rs.getString(5));
				contract.setDeliveryDay(rs.getString(6));
				contract.setQuantity(rs.getInt(7));
				list.add(contract);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}	
	

	@Override
	public boolean modify(int contractNo,ContractBean bean) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updatequery")))
		{
				pstmt.setInt(5,contractNo);
				
				pstmt.setInt(1,bean.getHaulierId());
				pstmt.setString(2,bean.getDeliveryDate());
				pstmt.setString(3,bean.getDeliveryDay());
				pstmt.setInt(4,bean.getQuantity());
				
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
	public boolean add(ContractBean user) {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery")))
		{
			pstmt.setInt(1, user.getContractNo());
			pstmt.setInt(2, user.getcustomerId());
			pstmt.setInt(3, user.getProductId());
			pstmt.setInt(4, user.getHaulierId());
			pstmt.setString(5,user.getDeliveryDate());
			pstmt.setString(6,user.getDeliveryDay());
			pstmt.setInt(7,user.getQuantity());
			
			
				
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
	public boolean deleteUser(int contractNo) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
		
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deletequery")))
		{
			pstmt.setInt(1,contractNo);
			
			
			
			
				
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