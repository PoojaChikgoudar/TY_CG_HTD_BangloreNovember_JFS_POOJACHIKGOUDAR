package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PreparedStatement pstmt=null;
		Connection conn=null;
		// TODO Auto-generated method stub

		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded....");


			//Get the db connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter the username and password");
			String dbuser=sc.nextLine();
			String dbpswd=sc.nextLine();
			conn=DriverManager.getConnection(dburl,dbuser,dbpswd);
			System.out.println("connection established...");

			String query="insert into users_info1 values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter the user_id");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()) );
			System.out.println("enter username");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter usermail..");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter Password");
			pstmt.setString(4, sc.nextLine());
			
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("values Inserted");
			}
			else {
				System.out.println("something went wrong..");
			}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
