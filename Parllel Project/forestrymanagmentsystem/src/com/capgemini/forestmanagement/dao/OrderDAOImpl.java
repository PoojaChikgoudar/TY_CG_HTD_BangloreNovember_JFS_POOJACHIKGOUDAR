package com.capgemini.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestManagementSystem.controller.HaulierMain;
import com.capgemini.forestrymanagement.bean.HaulierBean;
import com.capgemini.forestrymanagement.bean.OrderBean;

public class OrderDAOImpl implements OrderDAO{
	private List<OrderBean> beans=new ArrayList<OrderBean>();
	Scanner sc=new Scanner(System.in);

	@Override
	public List<OrderBean> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return beans;
	}

	@Override
	public OrderBean getOrderDetails(int orderId) {
		for(OrderBean orderBean:beans) {
			if(orderBean.getOrderid()==orderId) {
				return orderBean;
			}

		}
		return null;
	}

	@Override
	public boolean delete(int orderId) {
		for(OrderBean orderBean:beans) {
			OrderBean bean=null;
			if(orderBean.getOrderid()==orderId) {
				bean=orderBean;

			}

			if(bean!=null) {
				beans.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean add(OrderBean bean) {
		for(OrderBean bean1:beans) {
			if(bean1.getOrderid()==bean.getOrderid())
			{
				return false;
			}
		}
		beans.add(bean);
		return true;
		
	}

	@Override
	public boolean modify(int orderId) {
		for(OrderBean orderBean:beans) {
			if(orderBean.getOrderid()==orderId) {
				
				System.out.println("choose feild to be modified\n1.customername\n2.productname\n3.Hauliername\n4.Deliverydate\n5.HaulierMain");
				int c=sc.nextInt();
				switch(c) {
				case 1:
					boolean flag;
				do {
					String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter customer name to be modified");
				System.out.println("Enter name in capitalised format");
				String customerName=sc.next();
				flag=customerName.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					orderBean.setCustomername(customerName);
				}
				}while(!flag);
				break;
				
				
				
				
				case 2:
				boolean flag1;
				do {
					String nameregexpr="^[A-Za-z]*";
					System.out.println("enter product name to be modified");
				System.out.println("should contain alphabets only");
				String productName=sc.next();
				flag1=productName.matches(nameregexpr);
				if(!flag1)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					orderBean.setProductname(productName);
				}
				}while(!flag1);
				
				
				case 3:
				boolean name;
				do {
					String nameregexpr="^[A-Z][a-z]*";
					System.out.println("enter haulier name to be modified");
				System.out.println("Enter the name in capitalised format");
				String hauilerName=sc.next();
				name=hauilerName.matches(nameregexpr);
				if(!name)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					orderBean.setHauliername(hauilerName);
				}
				}while(!name);
				case 4:
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
					orderBean.setDeliverydate(deliveryDate);
				}
				}while(!datematcher);
				break;
				
				
				//case 5:OrderMain.main();
				//break;
				}
				
				}
				
			return true;
			
			
			
		}
		return false;
	}

}
