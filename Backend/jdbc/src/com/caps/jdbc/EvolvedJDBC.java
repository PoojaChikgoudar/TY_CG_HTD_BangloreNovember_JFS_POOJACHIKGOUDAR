package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class EvolvedJDBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("enter the username and password");
		String dbuser=sc.nextLine();
		String dbpswd=sc.nextLine();
		String query="select * from users_info1";
		try(Connection conn=DriverManager.getConnection(dburl, dbuser, dbpswd);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query)){
			while(rs.next()) {
				System.out.println("user_id: "+rs.getInt(1));
				System.out.println("username: "+rs.getString(2));
				System.out.println("Password: "+rs.getString(3));
			}
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
