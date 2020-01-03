package com.capgemini.jdbc.controller;

import java.util.Scanner;



import com.capgemini.jdbc.bean.ClientBean;

import com.mysql.jdbc.services.ClientService;

import com.capgemini.jdbc.factory.ClientManager;

public class AdminMain {

	public static void main() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("*******************");
		System.out.println("*****WELCOME to ForestryManagement!!*****");
		System.out.println("Enter the choice");
		System.out.println("1.admin");
		System.out.println("2.client");
		System.out.println("3.scheduler");
		System.out.println("4.Land");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:AdminMain1.main();
		break;
		case 2:ClientService service=ClientManager.instanceOfClientService();
		
		System.out.println("Client Login");
		System.out.println("Enter the customerName");
		String name=sc.next();
		System.out.println("Enter the customer password");
		String password1=sc.next();
		ClientBean bean=service.clientLogin(name, password1);
		if(bean!=null) {
			System.out.println("Login sucesssfull");
			ClientHome.main();
		}
		else {
			System.err.println("Invalid login");
			System.out.println("Enter the correct credentails");
		}
		break;
		case 3:
		case 4:LandMain.main();
		break;
		
		}
		}

	}

}
