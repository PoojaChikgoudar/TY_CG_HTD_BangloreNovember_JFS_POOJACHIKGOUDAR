package com.capgemini.forestManagementSystem.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestmanagement.dao.OrderDAO;
import com.capgemini.forestmanagement.factory.OrderFactory;
import com.capgemini.forestrymanagement.bean.OrderBean;

public class OrderMain {

	public static void main() {
		// TODO Auto-generated method stub
		OrderDAO dao=OrderFactory.getOrderDAO();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Choice");
			System.out.println("1.insert order details");
			System.out.println("2.search order details");
			System.out.println("3.getdetails of order");
			System.out.println("4.delete order details");
			System.out.println("5.modify");
			System.out.println("6.ClientHome");
			System.out.println("7.AdminHome");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:OrderBean  bean=new OrderBean();
				
			
			
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

			boolean check=dao.add(bean);
			if(check) {
				System.out.println("order added to list");
			}
			else {

				System.out.println("order id is repeated");
			}
			break;
			case 2:System.out.println("enter orderid to search");	
			int orderid2=sc.nextInt();

			OrderBean bean1=dao.getOrderDetails(orderid2);
			if(bean1!=null) {

				System.out.println(bean1.getOrderid());
				System.out.println(bean1.getCustomername());
				System.out.println(bean1.getProductname());
				System.out.println(bean1.getHauliername());
				System.out.println(bean1.getDeliverydate());
				


			}else {
				System.out.println("orderid not found");
			}
			break;
			case 3:
			List<OrderBean> bean3=dao.getAllOrderDetails();
			if(bean3!=null) {
				System.out.println(bean3);
			}
			else {
				System.out.println("order details not found");
			}
			break;
			case 4:System.out.println("Enter the orderid to delete");
			int orderid3=sc.nextInt();
			boolean check1=dao.delete(orderid3);
			if(check1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("Enter the valid orderid");
			}
			break;
			case 5:System.out.println("Enter the orderid3");
			int orderid4=sc.nextInt();
			
			boolean check2=dao.modify(orderid4);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("enter the valid orderid");
			}
			break;
			case 6:ClientHome.main();
			      break;
			case 7:AdminMain.main();
			break;
			}
		}


	}

}
