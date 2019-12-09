package com.caps.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv2 {

	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		
		try {
			 reader=new FileReader("C:\\Users\\my comp\\Desktop\\db.properties.txt");
			 prop=new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver loaded..");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"),prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				System.out.println("user_id: "+rs.getInt(1));
				System.out.println("username: "+rs.getString(2));
				System.out.println("Password: "+rs.getString(3));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
