package com.capgemini.forestManagementSystem.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestmanagement.dao.ContractDAO;
import com.capgemini.forestmanagement.factory.ContractDAOManager;
import com.capgemini.forestrymanagement.bean.ContractBean;
import com.capgemini.forestrymanagement.bean.CustomerBean;

public class ContractMain {

	public static void main() {
		// TODO Auto-generated method stub
		ContractDAO dao=ContractDAOManager.getForestDAO();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Insert contract details");
			System.out.println("2.delete contract");
			System.out.println("3.showAll Contract ");
			System.out.println("4.Client Home");
			System.out.println("5.Admin page");

			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:ContractBean  bean1=new ContractBean();
				
			
			
			
			boolean idmatcher=false;
			String idregexpr="^[0-9][0-9]{1,20}$";
			boolean flag1=false;
			while(!flag1){
				try {
					System.out.println("enter contract no");

					System.out.println("Id should contain  numbers only..");
					int contractno=sc.nextInt();
					flag1=true;
					String id1=Integer.toString(contractno);

					idmatcher=id1.matches(idregexpr);

					if(idmatcher) {
						bean1.setContractNo(contractno);
					}
					else {
						
						System.out.println("Invalid contractno");
					}
				}catch(Exception e) {
					sc.next();
					System.out.println("Invalid input");
				}	
			}
			
			
			boolean idmatcher5=false;
			String idregexpr5="^[0-9][0-9]{1,20}$";
			boolean flag4=false;
			while(!flag4){
				try {
					System.out.println("enter customer id");

					System.out.println("Id should contain  numbers only..");
					int customerId=sc.nextInt();
					flag4=true;
					String id1=Integer.toString(customerId);

					idmatcher5=id1.matches(idregexpr5);

					if(idmatcher5) {
						bean1.setCustomerId(customerId);
					}
					else {
						
						System.out.println("Invalid customerid");
					}
				}catch(Exception e) {
					sc.next();
					System.out.println("Invalid input");
				}	
			}

			boolean idmatcher1=false;
			String idregexpr1="^[0-9][0-9]{1,20}$";
			boolean flag2=false;
			while(!flag2){
				try {
					System.out.println("enter product id");

					System.out.println("Id should contain  numbers only..");
					int productId=sc.nextInt();
					flag2=true;
					String id1=Integer.toString(productId);

					idmatcher1=id1.matches(idregexpr1);

					if(idmatcher1) {
						bean1.setProductId(productId);
					}
					else {
						
						System.out.println("Invalid productid");
					}
				}catch(Exception e) {
					sc.next();
					System.out.println("Invalid input");
				}	
			}
			
			boolean idmatcher2=false;
			String idregexpr2="^[0-9][0-9]{1,20}$";
			boolean flag3=false;
			while(!flag3){
				try {
					System.out.println("enter haulier id");

					System.out.println("Id should contain  numbers only..");
					int haulierId=sc.nextInt();
					flag3=true;
					String id1=Integer.toString(haulierId);

					idmatcher2=id1.matches(idregexpr2);

					if(idmatcher2) {
						bean1.setHaulierId(haulierId);
					}
					else {
						
						System.out.println("Invalid haulierid");
					}
				}catch(Exception e) {
					sc.next();
					System.out.println("Invalid input");
				}	
			}
			
			
			

			boolean datematcher;
			do {
				System.out.println("enter delivery date in yyyy-mm-dd format");
			System.out.println("Id should contain 4 numbers..");
			String deliveryDate=sc.next();
			
			String reg="\\d{4}-\\d{2}-\\d{2}";
			datematcher=deliveryDate.matches(reg);
			
			if(!datematcher) 
				System.out.println("Invalid id");
				
			
			else {
				bean1.setDeliveryDate(deliveryDate);
			}
			}while(!datematcher);
			
			System.out.println("enter deliveryday");
			String deliveryDay=sc.next();
			
			
			
			
			boolean idmatcher4=false;
			String idregexpr4="^[0-9]{0,9999999999}$";
			boolean flag6=false;
			while(!flag6){
				try {
					System.out.println("enter quantity");

					System.out.println("quantity should contain  numbers only..");
					int quantity=sc.nextInt();
					flag6=true;
					String id4=Integer.toString(quantity);

					idmatcher4=id4.matches(idregexpr4);

					if(idmatcher4) {
						bean1.setQuantity(quantity);
					}
					else {
						
						System.out.println("Invalid quantity");
					}
				}catch(Exception e) {
					sc.next();
					System.out.println("Invalid input");
				}	
			}
			
			
			bean1.setDeliveryDay(deliveryDay);
			

			boolean check=dao.addContract(bean1);
			if(check) {
				System.out.println("contract added to list");
			}
			else {

				System.out.println("contractno  repeated");
			}
			break;
			
			
			case 2:System.out.println("Enter the contractno to delete");
			int contractNo1=sc.nextInt();
			
			if(dao.deleteContract(contractNo1)) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("Contractno not present");
			}
			break;
			case 3:
				List<ContractBean> forestbean3=dao.getAllContracts();
				if(forestbean3!=null) {
					System.out.println(forestbean3);
				}
				else {
					System.out.println("contract details not found");
				}
				break;
			case 4:ClientHome.main();
			     break;
			case 5:AdminMain.main();
			break;
			}
		}


	}

}
