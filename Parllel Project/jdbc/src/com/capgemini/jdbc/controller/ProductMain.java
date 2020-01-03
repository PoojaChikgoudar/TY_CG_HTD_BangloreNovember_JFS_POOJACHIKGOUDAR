package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;


import com.capgemini.jdbc.bean.ProductBean;
import com.capgemini.jdbc.factory.ProductDAOManager;
import com.mysql.jdbc.services.ProductService;


public class ProductMain {

	public static void main() {
		// TODO Auto-generated method stub
		 ProductService service=ProductDAOManager.instanceOfProductService();
		 ProductBean user=new ProductBean();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.List all products");
			System.out.println("2.insert product details");
			System.out.println("3.delete product details");
			System.out.println("4.update product details");
			System.out.println("5.ClientHome");
			System.out.println("6.home");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				  List<ProductBean> list=service.getAllProducts();
				  if(list!=null) {
					  for(ProductBean product:list) {
						  System.out.println(product);
					  }
				  }
				break;
			
			case 2:
				ProductBean bean=new ProductBean();
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
				
				
				
			
			boolean check=service.add(bean);
			if(check==true) {
				System.out.println("product added to list");
			}
			else {

				System.out.println("product id is repeated");
			}
			break;
			
			
			case 3:System.out.println("Enter the Productid to delete");
			int productid=sc.nextInt();
			
			boolean check1=service.delete(productid);
			if(check1) {
				System.out.println(" Product Deleted..");
			}
			else {
				System.out.println("Enter the correct productid");
			}
			break;
			case 4:System.out.println("enter the product id");
			int id1=sc.nextInt();
			ProductBean bean1=new ProductBean();
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
			   bean1.setProductName(productName1);
			}
			}while(!flag3);
			
			
			
			boolean check2=service.modify(id1,bean1);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("productid not present!Enter the correct productid");
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
