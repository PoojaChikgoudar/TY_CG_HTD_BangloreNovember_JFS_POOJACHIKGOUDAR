package com.capgemini.appdevelopment.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.appdevelopment.bean.Contact;
import com.capgemini.appdevelopment.factory.ContactDAOManager;
import com.capgemini.appdevelopment.service.ContactService;

public class ContactMain {

	public static void main(String[] args) {
		 ContactService service=ContactDAOManager.instanceOfContactServiceImpl();
		 Contact user=new Contact();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.list all contacts");
			System.out.println("2.search contact");
			System.out.println("3.operation");
			

			int ch=sc.nextInt();
			switch(ch) {
			case 1:
			  List<Contact> list=service.getAllContact();
			  if(list!=null) {
				  for(Contact contact:list) {
					  System.out.println(contact);
				  }
			  }
			
			
			break;
			case 2:System.out.println("enter name to search");	
			String name=sc.next();
			
			System.out.println("press 1 to call");
			System.out.println("press 2 to message");
			
			int ch1=sc.nextInt();
			switch(ch1) {
			case 1:System.out.println("calling");
			break;
			case 2:System.out.println("message sending...");
			break;
			
			}
         
			
			break;
			case 3:System.out.println("Enter the choice to perform operation");
			System.out.println("press 1 to insert");
			System.out.println("press 2 to delete");
			System.out.println("press 3 to update");
			int ch3=sc.nextInt();
			switch(ch3) {
			case 1:System.out.println("enter name");
			String name1=sc.next();
			System.out.println("enter number");
			Long number1=sc.nextLong();
			System.out.println("enter the group");
			String group1=sc.next();
	        
			Contact contact3 =new Contact();
			contact3.setName(name1);
			contact3.setNumber(number1);
			contact3.setGroup1(group1);
			
			
			boolean check=service.insert(contact3);
			if(check) {
				System.out.println("contact added to list");
			}
			else {

				System.out.println("contact  is repeated");
			}
			break;
			case 2:System.out.println("Enter the name to delete");
			String name3=sc.next();
			
			boolean check1=service.delete(name3);
			if(check1) {
				System.out.println(" contact Deleted..");
			}
			else {
				System.out.println("something went wrong");
			}
			break;
			case 3:System.out.println("enter the name");
			String name4=sc.next();
			Contact contact2=new Contact();
		    System.out.println("enter number to be modified");
			contact2.setNumber(sc.nextLong());
			System.out.println("enter the group to be modified");
			contact2.setGroup1(sc.next());
			
			
			boolean check2=service.update(name4, contact2);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("something went wrong");
			}
			break;
			
			
			}
			}
			
			
			
	} 


	}

}
