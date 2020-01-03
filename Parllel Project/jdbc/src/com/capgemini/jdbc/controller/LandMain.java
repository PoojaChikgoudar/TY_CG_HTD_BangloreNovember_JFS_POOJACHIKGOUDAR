package com.capgemini.jdbc.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.capgemini.jdbc.bean.LandBean;

import com.capgemini.jdbc.factory.LandManager;

import com.mysql.jdbc.services.LandService;

public class LandMain {

	public static void main() {
		// TODO Auto-generated method stub
		LandService service=LandManager.instanceOfLandService();
		 LandBean land=new LandBean();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.List all land details");
			System.out.println("2.insert land details");
			System.out.println("3.delete land details");
			System.out.println("4.update land details");
			
			System.out.println("5.Main home");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				  List<LandBean> list=service.getAllLandDetails();
				  if(list!=null) {
					  for(LandBean land1:list) {
						  System.out.println(land1);
					  }
				  }
				break;
			
			case 2:
				LandBean bean=new LandBean();
				
				boolean idmatcher=false;
				String idregexpr="^[0-9][0-9]{1,20}$";
				boolean flag1=false;
				while(!flag1){
					try {
						System.out.println("enter land id");

						System.out.println("Id should contain  numbers only..");
						int landId=sc.nextInt();
						flag1=true;
						String id1=Integer.toString(landId);

						idmatcher=id1.matches(idregexpr);

						if(idmatcher) {
							bean.setLandId(landId);
						}
						else {
							
							System.out.println("Invalid landid");
						}
					}catch(Exception e) {
						sc.next();
						System.out.println("Invalid input");
					}	
				}
				
				
				
				
				boolean flag;
				do {
					String nameregexpr="^[A-Z][a-z]*";
					System.out.println("enter land location");
				System.out.println("should enter in capitalized format");
				String landlocation=sc.next();
				flag=landlocation.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
				   bean.setLandlocation(landlocation);
				}
				}while(!flag);
				boolean landownermatches;
				do {
					String nameregexpr="^[A-Z][a-z]*";
					System.out.println("enter land Ownername");
				System.out.println("should enter in capitalized format");
				String landowner=sc.next();
				landownermatches=landowner.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
				   bean.setLandOwner(landowner);
				}
				}while(!landownermatches);
;
			
			

			boolean check=service.add(bean);
			if(check==true) {
				System.out.println("landdetails added to list");
			}
			else {

				System.out.println("land id is repeated");
			}
			
				
				break;
			
			
			case 3:System.out.println("Enter the landid to delete");
			int id=sc.nextInt();
			
			boolean check1=service.delete(id);
			if(check1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("landid is not present");
			}
			break;
			case 4:System.out.println("enter the landid");
			int id1=sc.nextInt();
			LandBean bean1=new LandBean();
		   
			boolean flag3;
			do {
				String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter land location");
			System.out.println("should enter in capitalized format");
			String landlocation=sc.next();
			flag3=landlocation.matches(nameregexpr);
			if(!flag3)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean1.setLandlocation(landlocation);
			}
			}while(!flag3);
			
			boolean landownermatches1;
			do {
				String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter land Ownername");
			System.out.println("should enter in capitalized format");
			String landowner=sc.next();
			landownermatches1=landowner.matches(nameregexpr);
			if(!landownermatches1)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean1.setLandOwner(landowner);
			}
			}while(!landownermatches1);
			
			boolean check2=service.modify(id1,bean1);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("Enter the correct customerid");
			}
			break;
			
			case 5:AdminMain.main();
			break;
			}

	}
	}

}
