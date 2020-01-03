package com.capgemini.forestManagementSystem.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestmanagement.dao.ProductDAO;

import com.capgemini.forestmanagement.factory.ProductDAOManager;

import com.capgemini.forestrymanagement.bean.ProductBean;

public class ProductMain {

	public static void main() {
		ProductDAO dao=ProductDAOManager.getForestDAO();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.insert product details");
			System.out.println("2.search product");
			System.out.println("3.get Product details");
			System.out.println("4.delete product");
			System.out.println("5.Modify");
			System.out.println("6.Home");
			System.out.println("7.Clienthome");
			System.out.println("8.AdminHome");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:ProductBean  bean=new ProductBean();
				
			
			
			boolean idmatcher=false;
			String idregexpr="^[0-9][0-9]{1,20}$";
			boolean flag1=false;
			while(!flag1){
				try {
					System.out.println("enter product id");

					System.out.println("Id should contain  numbers only..");
					int productId=sc.nextInt();
					flag1=true;
					String id1=Integer.toString(productId);

					idmatcher=id1.matches(idregexpr);

					if(idmatcher) {
						bean.setProductId(productId);
					}
					else {
						
						System.out.println("Invalid productid");
					}
				}catch(Exception e) {
					sc.next();
					System.out.println("Invalid input");
				}	
			}

			
			
			boolean flag;
			do {
				String nameregexpr="^[A-Za-z]*";
				System.out.println("enter product name");
			System.out.println("should contain alphabets only");
			String productName=sc.next();
			flag=productName.matches(nameregexpr);
			if(!flag)
				System.out.println("Invalid...Please Enter alphabets only");
			else {
			   bean.setProductName(productName);
			}
			}while(!flag);
			
			
			
			
			
			boolean check=dao.addProduct(bean);
			if(check) {
				System.out.println("product added to list");
			}
			else {

				System.out.println("product id is repeated");
			}
			break;
			case 2:System.out.println("enter productid to search");	
			int productId3=sc.nextInt();

			ProductBean forestbean=dao.getProduct(productId3);
			if(forestbean!=null) {

				System.out.println(forestbean.getProductId());
				System.out.println(forestbean.getProductName());
				


			}else {
				System.out.println("productid not found");
			}
			break;
			case 3:
			List<ProductBean> forestbean3=dao.getAllProduct();
			if(forestbean3!=null) {
				System.out.println(forestbean3);
			}
			else {
				System.out.println("product details not found");
			}
			break;
			case 4:System.out.println("Enter the productid to delete");
			int productId1=sc.nextInt();
			boolean check1=dao.deleteProduct(productId1);
			if(check1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("Enter the correct productid");
			}
			break;
			case 5:System.out.println("Enter the product id");
			int productId6=sc.nextInt();
			boolean check2=dao.modify(productId6);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("Productid not present");
			}
			break;
			case 6:Home.main();
			break;
			case 7:ClientHome.main();
			      break;
			case 8:AdminMain.main();
			break;
			}
		}


	}

}
