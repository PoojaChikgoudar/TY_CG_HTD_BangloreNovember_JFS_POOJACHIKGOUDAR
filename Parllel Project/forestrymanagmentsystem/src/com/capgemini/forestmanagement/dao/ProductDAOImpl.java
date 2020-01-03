package com.capgemini.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagement.bean.CustomerBean;
import com.capgemini.forestrymanagement.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc=new Scanner(System.in);

	private List<ProductBean> beans=new ArrayList<ProductBean>();

	@Override
	public List<ProductBean> getAllProduct() {
		// TODO Auto-generated method stub
		return beans;
	}

	@Override
	public ProductBean getProduct(int productId) {
		for(ProductBean productbean:beans) {
			if(productbean.getProductId()==productId) {
				return productbean;
			}

		}
		return null;
	}

	@Override
	public boolean deleteProduct(int productId) {
		for(ProductBean productbean:beans) {
			ProductBean bean=null;
			if(productbean.getProductId()==productId) {
				bean=productbean;

			}

			if(bean!=null) {
				beans.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		for(ProductBean productbean:beans) {
			if(productbean.getProductId()==bean.getProductId())
			{
				return false;
			}
		}
		beans.add(bean);
		return true;
	}

	@Override
	public boolean modify(int productId) {
		for(ProductBean productBean:beans) {
			if(productBean.getProductId()==productId) {
				System.out.println("choose feild to be modified\n  1.Productname\n ");
				int c=sc.nextInt();
				switch(c) {
				case 1:boolean flag;
				do {
					String nameregexpr="^[A-Za-z]*";
					System.out.println("enter product name to be modified");
				System.out.println("should contain alphabets only");
				String productName=sc.next();
				flag=productName.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					productBean.setProductName(productName);
				}
				}while(!flag);
				
				}
				
			}
		}
		
		
		return true;
	}

}
