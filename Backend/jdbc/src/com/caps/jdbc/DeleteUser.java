package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Driver driver=new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			System.out.println("driver loaded....");
			
			
			//Get the db connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter the username and password");
			String dbuser=sc.nextLine();
			String dbpswd=sc.nextLine();
			con=DriverManager.getConnection(dburl,dbuser,dbpswd);
			System.out.println("connection established...");
			
			//issue sql query
			String query="Delete from users_info1 where user_id=? and password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter userid...");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password...");
			pstmt.setString(2, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user deleted");
			}
			else {
				System.out.println("something went wrong.....");
			}
				
		
			System.out.println("***********");
			
			//process the results
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		//close all jdbc objects
		finally{
			
			try {
				if(con!=null) {
				con.close();
			}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(pstmt!=null) {
				pstmt.close();
			}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	

	}

}
