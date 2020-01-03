package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.AdminBean;
import com.capgemini.jdbc.factory.AdminManager;
import com.mysql.jdbc.services.AdminService;

public class AdminMain1 {

	public static void main() {
		AdminService service=AdminManager.instanceOfAdminService();
		//AdminBean bean1=new AdminBean();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("1.Admin signUp");
		System.out.println("2.admin Login");
		System.out.println("3.Main Home");
		int choice=sc.nextInt();
		switch(choice) {
		
		
		case 1:
		AdminBean bean=new AdminBean();
		
		boolean flag;
		do {
			String nameregexpr="^[A-Z][a-z]*";
			System.out.println("enter customer name");
			System.out.println("Enter the name in capitalised format");
			String name=sc.next();
			flag=name.matches(nameregexpr);
			if(!flag)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
				bean.setName(name);
			}
		}while(!flag);
		boolean emailmatcher;
		do {
			System.out.println("enter customer email");
			String email =sc.next();
			
			String email1="^(.+)@(.+)$";
			emailmatcher=email.matches(email1);

			if(!emailmatcher) 
				System.out.println("Invalid Email");


			else {
				bean.setEmail(email);

			}
		}while(!emailmatcher);
			boolean passwordmatcher;
			do {
			System.out.println("enter client password");
			System.out.println("password must contain atleast one lowercase letter one uppercase one number and one special character");
			String password =sc.next();
				
			String email1="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
			passwordmatcher=password.matches(email1);
			
			if(!passwordmatcher) 
				System.out.println("Invalid password");
			else {
				bean.setPassword(password);
			}
			}while(!passwordmatcher);
				
		  
			boolean check=service.signUp(bean);
			if(check==true) {
				System.out.println("admin sucessfully signedin!!");
			}
			else {

				System.out.println("Admin not sucessfully signedin");
			}
			break;
		case 2:AdminBean bean1=new AdminBean();
		System.out.println("Admin Login");
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the password");
		String password=sc.next();
		AdminBean admin=service.adminLogin(name, password);
		if(admin!=null) {
			System.out.println("Login sucessful");
			Home.main();
		}
		else {
			System.out.println("Enter the correct Login details");
			//service.signUp(bean1);
			
		}
		break;
		case 3:AdminMain.main();
		break;
		}
		}
}
}