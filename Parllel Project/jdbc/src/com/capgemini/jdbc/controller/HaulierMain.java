package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;


import com.capgemini.jdbc.bean.HaulierBean;

import com.capgemini.jdbc.factory.HaulierManager;

import com.mysql.jdbc.services.HaulierService;

public class HaulierMain {
	public static void main() {
		
	
	HaulierService service=HaulierManager.instanceOfHaulierService();
	 HaulierBean user=new HaulierBean();
	 Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter the choice");
		System.out.println("1.get all hauliers");
		System.out.println("2.insert haulier details");
		System.out.println("3.delete haulier details");
		System.out.println("4.update haulier details");
		System.out.println("5.home");

		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			  List<HaulierBean> list=service.getAllHaulier();
			  if(list!=null) {
				  for(HaulierBean haulier:list) {
					  System.out.println(haulier);
				  }
			  }
			break;
		
		case 2:
			HaulierBean bean=new HaulierBean();
			boolean idmatcher=false;
			String idregexpr="^[0-9][0-9]{1,20}$";
			boolean flag1=false;
			while(!flag1){
				try {
					System.out.println("enter haulier id");

					System.out.println("Id should contain  numbers only..");
					int haulierId=sc.nextInt();
					flag1=true;
					String id1=Integer.toString(haulierId);

					idmatcher=id1.matches(idregexpr);

					if(idmatcher) {
						bean.setHaulier_id(haulierId);
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
				System.out.println("enter haulier name");
			System.out.println("Enter the name in capitalised format");
			String haulerName=sc.next();
			flag=haulerName.matches(nameregexpr);
			if(!flag)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean.setHaulier_name(haulerName);
			}
			}while(!flag);
			
			
			
			
			boolean addmatcher;
			do {
				System.out.println("enter  adress");
			String adress=sc.next();
			
			String regexp="^[0-9A-Za-z]*";
			
			 addmatcher=adress.matches(regexp);
			
			if(!addmatcher) 
				System.out.println("Invalid adress");
			
				
			else {
				bean.setAdress(adress);
				
				}
			}while(!addmatcher);
			
			
			
		
			boolean emailmatcher;
			do {
			System.out.println("enter haulier email");
			String email =sc.next();
				
			String email1="^(.+)@(.+)$";
			emailmatcher=email.matches(email1);
			
			if(!emailmatcher) 
				System.out.println("Invalid Email");
			
				
			else {
				bean.setEmail(email);
				
				}

				}while(!emailmatcher);
			
			
			
			boolean nummatcher;
			do {
			System.out.println("enter haulier telephone");
			long telephoneNumber=sc.nextLong();
			String num=Long.toString(telephoneNumber);
			String phoneNumber="^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
			nummatcher=num.matches(phoneNumber);
			
			if(!nummatcher) 
				System.out.println("Invalid number...");
			
				
			
			
			
			else {
				bean.setTelephone(telephoneNumber);
				

				}
			}
			while(!nummatcher);
			
			
			
		boolean check=service.add(bean);
		if(check==true) {
			System.out.println("haulier added to list");
		}
		else {

			System.out.println("haulierid is repeated");
		}
		break;
		
		
		case 3:System.out.println("Enter the haulier_id to delete");
		int id=sc.nextInt();
		
		boolean check1=service.deletehaulier(id);
		
		if(check1) {
			System.out.println("Deleted..");
		}
		else {
			System.out.println("haulier_id is not present");
		}
		break;
		case 4:System.out.println("enter the haulier_id");
		int  haulier_id1=sc.nextInt();
		
		HaulierBean haulier=new HaulierBean();
		

		boolean flag7;
		do {
			String nameregexpr="^[A-Z][a-z]*";
			System.out.println("enter haulier name to be modified");
		System.out.println("Enter the name in capitalised format");
		String haulerName1=sc.next();
		flag7=haulerName1.matches(nameregexpr);
		if(!flag7)
			System.out.println("Invalid...Please Enter alphabets only");
		else {
		   haulier.setHaulier_name(haulerName1);
		}
		}while(!flag7);
		
		
		
		
		boolean addmatcher2;
		do {
			System.out.println("enter  adress to be modified");
		String adress1=sc.next();
		
		String regexp="^[0-9A-Za-z]*";
		
		 addmatcher2=adress1.matches(regexp);
		
		if(!addmatcher2) 
			System.out.println("Invalid adress");
		
			
		else {
			haulier.setAdress(adress1);
			
			}
		}while(!addmatcher2);
		
		
		
	
		boolean emailmatcher2;
		do {
		System.out.println("enter haulier email to be modified");
		String email =sc.next();
			
		String email1="^(.+)@(.+)$";
		emailmatcher2=email.matches(email1);
		
		if(!emailmatcher2) 
			System.out.println("Invalid Email");
		
			
		else {
			haulier.setEmail(email);
			
			}

			}while(!emailmatcher2);
		
		
		
		System.out.println("enter the telephone number to be modified");
		haulier.setTelephone(sc.nextLong());
		
		boolean modify=service.modify(haulier_id1,haulier);
		if(modify) {
			System.out.println("modified..");
		}
		else {
			System.out.println("Enter the correct customerid");
		}
		break;
		case 5:Home.main();
		    break;
		}
	}
	

} 

}

