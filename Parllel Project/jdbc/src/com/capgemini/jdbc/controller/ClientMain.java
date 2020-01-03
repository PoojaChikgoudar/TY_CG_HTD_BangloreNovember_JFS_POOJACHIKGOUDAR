package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.jdbc.bean.ClientBean;

import com.capgemini.jdbc.factory.ClientManager;

import com.mysql.jdbc.services.ClientService;


public class ClientMain {

	public static void main() {
		// TODO Auto-generated method stub
		ClientService service=ClientManager.instanceOfClientService();
		 ClientBean user=new ClientBean();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.List all clientdetails");
			System.out.println("2.insert client details");
			System.out.println("3.delete client details");
			System.out.println("4.update client details");
			System.out.println("5.home");
			System.out.println("6.AdminHome");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				  List<ClientBean> list=service.getAllClients();
				  if(list!=null) {
					  for(ClientBean bean:list) {
						  System.out.println(bean);
					  }
				  }
				break;
			
			case 2:
				ClientBean bean=new ClientBean();
				boolean idmatcher=false;
				String idregexpr="^[0-9][0-9]{1,20}$";
				boolean flag1=false;
				while(!flag1){
					try {
						System.out.println("enter client id");

						System.out.println("Id should contain  numbers only..");
						int clientId=sc.nextInt();
						flag1=true;
						String id1=Integer.toString(clientId);

						idmatcher=id1.matches(idregexpr);

						if(idmatcher) {
							bean.setClientid(clientId);
						}
						else {
							
							System.out.println("Invalid haulierid");
						}
					}catch(Exception e) {
						sc.next();
						System.out.println("Invalid input");
					}	
				}
				
				
				boolean flag;
				do {
					String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter customer name");
				System.out.println("Enter the name in capitalised format");
				String clientName=sc.next();
				flag=clientName.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
				   bean.setClientName(clientName);
				}
				}while(!flag);
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
					
				
				
			boolean check=service.add(bean);
			if(check==true) {
				System.out.println("client added to list");
			}
			else {

				System.out.println("client id is repeated");
			}
			break;
			
			
			case 3:System.out.println("Enter the clientid to delete");
			int clientid=sc.nextInt();
			
			boolean check1=service.delete(clientid);
			if(check1) {
				System.out.println(" client Deleted..");
			}
			else {
				System.out.println("Enter the correct clientid");
			}
			break;
			case 4:System.out.println("enter the clientid");
			int id1=sc.nextInt();
			ClientBean bean1=new ClientBean();
			boolean flag5;
			do {
				String nameregexpr="^[A-Z][a-z]*";
			System.out.println("enter client name");
			System.out.println("Enter the name in capitalised format");
			String clientName=sc.next();
			flag5=clientName.matches(nameregexpr);
			if(!flag5)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean1.setClientName(clientName);
			}
			}while(!flag5);
			boolean passwordmatcher1;
			do {
			System.out.println("enter client password");
			System.out.println("password must contain atleast one lowercase letter one uppercase one number and one special character");
			String password =sc.next();
				
			String email1="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
			passwordmatcher1=password.matches(email1);
			
			if(!passwordmatcher1) 
				System.out.println("Invalid password");
			else {
				bean1.setPassword(password);
			}
			}while(!passwordmatcher1);
				
			
			
			
			boolean check2=service.modify(id1,bean1);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("clientid not present!Enter the correct clientid");
			}
			break;
			case 5:Home.main();
			     break;
			case 6:AdminMain.main();
			break;
			}
		}

	}

}
