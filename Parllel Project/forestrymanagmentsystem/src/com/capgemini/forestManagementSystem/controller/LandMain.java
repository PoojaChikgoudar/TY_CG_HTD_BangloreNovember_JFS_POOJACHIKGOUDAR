package com.capgemini.forestManagementSystem.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestmanagement.dao.LandDAO;

import com.capgemini.forestmanagement.factory.LandFactory;

import com.capgemini.forestrymanagement.bean.LandBean;


public class LandMain {

	public static void main() {
		// TODO Auto-generated method stub
		LandDAO dao=LandFactory.getLandDAO();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("1.insert land details");
			System.out.println("2.search land");
			System.out.println("3.get land details");
			System.out.println("4.delete land");
			System.out.println("5.Modify");
			System.out.println("6.home");
			System.out.println("7.AdminHome");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:LandBean bean=new LandBean();
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

			boolean costmatcher=false;
			String idregexpr1="^[0-9][0-9]{1,20}$";
			boolean flag5=false;
			while(!flag5){
				try {
					System.out.println("enter land cost");

					System.out.println("Cost should contain  numbers only..");
					int landcost=sc.nextInt();
					flag5=true;
					String id1=Integer.toString(landcost);

					costmatcher=id1.matches(idregexpr1);

					if(costmatcher) {
						bean.setLandCost(landcost);
					}
					else {
						
						System.out.println("Invalid cost");
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

			boolean check=dao.add(bean);
			if(check) {
				System.out.println("land details added to list");
			}
			else {

				System.out.println("land id id is repeated");
			}
			
			
				break;
			case 2:System.out.println("enter landid to search");	
			int landId=sc.nextInt();

			LandBean bean1=dao.getlanddetails(landId);
			if(bean1!=null) {

				System.out.println(bean1.getLandCost());
				System.out.println(bean1.getLandlocation());
				System.out.println(bean1.getLandOwner());
				


			}else {
				System.out.println("landid not found");
			}
			break;
			case 3:
			List<LandBean> bean3=dao.getAllLandDetails();
			if(bean3!=null) {
				System.out.println(bean3);
			}
			else {
				System.out.println("land details not found");
			}
			break;
			case 4:System.out.println("Enter the productid to delete");
			int Id1=sc.nextInt();
			boolean check1=dao.delete(Id1);
			if(check1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("Enter the correct landid");
			}
			break;
			case 5:System.out.println("Enter the land id");
			int Id6=sc.nextInt();
			boolean check2=dao.modify(Id6);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("Productid not present");
			}
			break;
			case 6:Home.main();
			      break;
			case 7:AdminMain.main();
			break;
			}
		}

	}

}
