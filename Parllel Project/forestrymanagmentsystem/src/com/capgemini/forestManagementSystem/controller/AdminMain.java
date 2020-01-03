package com.capgemini.forestManagementSystem.controller;

import java.util.Scanner;

import com.capgemini.forestmanagement.dao.AdminDAO;
import com.capgemini.forestmanagement.dao.ClientDAO;
import com.capgemini.forestmanagement.dao.CustomerDAO;
import com.capgemini.forestmanagement.dao.InvalidCredentailException;
import com.capgemini.forestmanagement.dao.SchedulerDao;
import com.capgemini.forestmanagement.factory.AdminManager;
import com.capgemini.forestmanagement.factory.ClientManager;
import com.capgemini.forestmanagement.factory.CustomerDAOManager;
import com.capgemini.forestmanagement.factory.SchedularManager;
import com.capgemini.forestrymanagement.bean.AdminBean;
import com.capgemini.forestrymanagement.bean.CustomerBean;
import com.capgemini.forestrymanagement.bean.Schedular;

public class AdminMain {

	//private static final CustomerDAO CustomerManager = null;

	public static void main() {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("*********WELCOME TO FORESTRYMANAGEMENT*******");
			System.out.println("Enter the choice");
			System.out.println("1.Admin");
			System.out.println("2.client");
			System.out.println("3.scheduler");
			System.out.println("4.Land");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:AdminDAO dao=AdminManager.getAdminDAO();
		System.out.println("*****Admin Login******");
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
			boolean check;
			try {
				check = dao.adminLogin(username,password);
				if(check) {
				Home.main();
				}
				else {
					System.out.println("");
				}
			} catch (InvalidCredentailException e) {
				
				e.printStackTrace();
			}
		
		break;
		
		case 2:ClientDAO client=ClientManager.getClientDAO();
		
		System.out.println("Client Login");
		System.out.println("Enter the clientName");
		String name=sc.next();
		System.out.println("Enter the client password");
		String password1=sc.next();
		boolean check1=client.clientLogin(name, password1);
		if(check1) {
			System.out.println("Login sucesssfull");
			ClientHome.main();
		}
		else {
			System.out.println("Invalid login");
		}
		break;
		
		
		case 3:SchedulerDao dao1=SchedularManager.getSchedularDAO();
		Schedular schedular=new Schedular();
			System.out.println("******Schedular*******");
		System.out.println("Enter contract number");
	    int contractNo=sc.nextInt();
	    System.out.println("Enter Status report");
	    String status=sc.next();
	    boolean check3=dao1.add(schedular);
	    if(check3) {
	    	System.out.println("Status reported");
	    }
	    else {
	    	System.out.println("Enter the correct contractno");
	    }
	    break;
		case 4:LandMain.main();
		break;
		}
	}
	}

}
