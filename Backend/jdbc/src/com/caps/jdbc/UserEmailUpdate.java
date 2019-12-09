package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;


		
		
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver has been loaded");

			//establish db connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter the dbusername and dbpassword");
			String dbuser=sc.nextLine();
			String dbpwd=sc.nextLine();
			conn=DriverManager.getConnection(dburl, dbuser, dbpwd);
			System.out.println("connection established..");

			//issue sql query
			String query="Update users_info1 set usermail=? where user_id=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter the user_id");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the email");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter the password to update");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			
			//process the results
			if(count>0) {
				System.out.println("Query OK,1 Rows effected");
			}
			else {
				System.out.println("something went wrong");
			}
			sc.close();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close all jdbc objects
		finally{

			try {
				if(conn!=null) {
					conn.close();
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




