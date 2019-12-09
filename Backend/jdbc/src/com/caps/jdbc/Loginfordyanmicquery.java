package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Loginfordyanmicquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// Load the driver
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded..");
			
			//Establish the db connection via the driver
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter user and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			
			con=DriverManager.getConnection(dburl,dbUser,dbPass);
			System.out.println("connection established....");
			
			//issue sql query via connection
			String query="select * from users_info1 where user_id=? and password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("enter userid....");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter password..");
			pstmt.setString(2, sc.nextLine());
			rs=pstmt.executeQuery();
			
			System.out.println("query issued and executed...");
			System.out.println("***********************");
			
			//process the results issued by sql query
			if(rs.next()) {
				System.out.println("user_id :"+rs.getInt(1));
				System.out.println("username :"+rs.getString(2));
				System.out.println("useremail :"+rs.getString(3));
				
			}
				
			
		} catch (SQLException e) {
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
				try {
					if(rs!=null) {
					rs.close();
				}
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
			}
		
        
		
		
		



