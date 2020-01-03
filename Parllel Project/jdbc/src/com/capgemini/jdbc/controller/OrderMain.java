package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;


import com.capgemini.jdbc.bean.OrderBean;

import com.capgemini.jdbc.factory.OrderManager;

import com.mysql.jdbc.services.OrderService;

public class OrderMain {

	public static void main() {
		 OrderService service=OrderManager.instanceOfOrderService();
		 OrderBean order=new OrderBean();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Choice");
			System.out.println("1.List all order details");
			System.out.println("2.insert order details");
			System.out.println("3.delete order details");
			System.out.println("4.update order details");
			System.out.println("5.Clienthome");
			System.out.println("6.home");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				  List<OrderBean> list=service.getAllOrderDetails();
				  if(list!=null) {
					  for(OrderBean order1:list) {
						  System.out.println(order1);
					  }
				  }
				break;
			
			case 2:
			OrderBean bean=new OrderBean();
			boolean idmatcher=false;
			String idregexpr="^[0-9][0-9]{1,20}$";
			boolean flag1=false;
			while(!flag1){
				try {
					System.out.println("enter order id");

					System.out.println("Id should contain  numbers only..");
					int orderId=sc.nextInt();
					flag1=true;
					String id1=Integer.toString(orderId);

					idmatcher=id1.matches(idregexpr);

					if(idmatcher) {
						bean.setOrderid(orderId);
					}
					else {
						
						System.out.println("Invalid orderid");
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
			System.out.println("Enter name in capitalised format");
			String customerName=sc.next();
			flag=customerName.matches(nameregexpr);
			if(!flag)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean.setCustomername(customerName);
			}
			}while(!flag);
			
			
			
			
			
			
			boolean flag2;
			do {
				String nameregexpr="^[A-Za-z]*";
				System.out.println("enter product name");
			System.out.println("should contain alphabets only");
			String productName=sc.next();
			flag2=productName.matches(nameregexpr);
			if(!flag2)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean.setProductname(productName);
			}
			}while(!flag2);
			
			
			
			boolean name;
			do {
				String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter haulier name");
			System.out.println("Enter the name in capitalised format");
			String hauilerName=sc.next();
			name=hauilerName.matches(nameregexpr);
			if(!name)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean.setHauliername(hauilerName);
			}
			}while(!name);
			boolean datematcher;
			do {
				System.out.println("enter delivery date in yyyy-mm-dd format");
			System.out.println("enter the valid date..");
			String deliveryDate=sc.next();
			
			String reg="\\d{4}-\\d{2}-\\d{2}";
			datematcher=deliveryDate.matches(reg);
			
			if(!datematcher) 
				System.out.println("Invalid id");
				
			
			else {
				bean.setDeliverydate(deliveryDate);
			}
			}while(!datematcher);

			boolean check=service.add(bean);
			if(check==true) {
				System.out.println("order added to list");
			}
			else {

				System.out.println("order id is repeated");
			}
			break;
			
			
			case 3:System.out.println("Enter the orderid to delete");
			int id=sc.nextInt();
			
			boolean check1=service.delete(id);
			if(check1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("orderid is not present");
			}
			break;
			case 4:System.out.println("enter the orderid");
			int id1=sc.nextInt();
			OrderBean bean1=new OrderBean();
			boolean flag6;
			do {
				String nameregexpr="^[A-Z][a-z]*";
			System.out.println("enter customer name to be modified");
			System.out.println("Enter name in capitalised format");
			String customerName1=sc.next();
			flag6=customerName1.matches(nameregexpr);
			if(!flag6)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean1.setCustomername(customerName1);
			}
			}while(!flag6);
			
			
			
			
			
			
			boolean flag3;
			do {
				String nameregexpr="^[A-Za-z]*";
				System.out.println("enter product name to be modified");
			System.out.println("should contain alphabets only");
			String productName1=sc.next();
			flag3=productName1.matches(nameregexpr);
			if(!flag3)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean1.setProductname(productName1);
			}
			}while(!flag3);
			
			
			
			boolean name1;
			do {
				String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter haulier name");
			System.out.println("Enter the name in capitalised format");
			String hauilerName1=sc.next();
			name1=hauilerName1.matches(nameregexpr);
			if(!name1)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean1.setHauliername(hauilerName1);
			}
			}while(!name1);
			boolean datematcher1;
			do {
				System.out.println("enter delivery date in yyyy-mm-dd format");
			System.out.println("enter the valid date..");
			String deliveryDate1=sc.next();
			
			String reg="\\d{4}-\\d{2}-\\d{2}";
			datematcher1=deliveryDate1.matches(reg);
			
			if(!datematcher1) 
				System.out.println("Invalid id");
				
			
			else {
				bean1.setDeliverydate(deliveryDate1);
			}
			}while(!datematcher1);

			
			
			
			
			boolean check2=service.modify(id1,bean1);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("Enter the correct customerid");
			}
			break;
			case 5:ClientHome.main();
			    break;
			case 6:Home.main();
			break;
			}
		}



	}

}
