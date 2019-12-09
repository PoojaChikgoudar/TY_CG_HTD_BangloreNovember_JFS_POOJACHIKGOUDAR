package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// Load the driver
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		Statement stmt=null;
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
			String query="select * from users_info1 where user_id=101 and password='pooja'";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query issued and executed...");
			
			//process the results issued by sql query
			if(rs.next()) {
				System.out.println("userid :"+rs.getInt(1));
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
					if(stmt!=null) {
					stmt.close();
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
		
        
		
		
		


