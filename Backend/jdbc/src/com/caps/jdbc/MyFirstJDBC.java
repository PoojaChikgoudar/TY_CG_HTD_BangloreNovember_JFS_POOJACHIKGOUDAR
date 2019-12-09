package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//Load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded...");
			
			//get db connection via the driver
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			System.out.println("connection established..");
			
			//Issue sql query via connection
			String query="select * from users_info1";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query issued...");
			System.out.println("*****************");
			
			//process the result returned
			while(rs.next()) {
				System.out.println("userid: "+rs.getInt("user_id"));
				System.out.println("username: "+rs.getString("username"));
                System.out.println("usermail "+rs.getString("usermail"));
                System.out.println("********");
                
                
			}
		} catch (SQLException e) {
		   e.printStackTrace();
		}
		
		//close all jdbc objects
		finally {
			
				try {
					if(con!=null) 
					con.close();
				} catch (SQLException a) {
					a.printStackTrace();
				}
				try {
					if(stmt!=null) 
						con.close();
				}
				catch(SQLException s) {
				s.printStackTrace();
			}
				try {
					if(rs!=null) 
						con.close();
				}
				catch(SQLException s) {
				s.printStackTrace();
			}
		}
	}

}
