package com.capgemini.forestmanagement.dao;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestManagementSystem.controller.CustomerMain;
import com.capgemini.forestrymanagement.bean.AdminBean;
import com.capgemini.forestrymanagement.bean.CustomerBean;


public class  CustomerDAOImpl implements CustomerDAO {
	private static  List<CustomerBean> beans=new ArrayList<CustomerBean>();
	Scanner sc=new Scanner(System.in);
	@Override
	public List<CustomerBean> getAllCustomers() {

		return beans;
	}

	@Override
	public CustomerBean getCustomer(int customerId) {
		for(CustomerBean customerbean:beans) {
			if(customerbean.getCustomerId()==customerId) {
				return customerbean;
			}

		}

		return null;
	}

	@Override
	public boolean deleteCustomer(int customerId)  {
		for(CustomerBean customerbean:beans) {
			CustomerBean bean=null;
			if(customerbean.getCustomerId()==customerId) {
				bean=customerbean;

			}

			if(bean!=null) {
				beans.remove(bean);
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean addCustomer(CustomerBean bean) throws InputMismatchException{
		for(CustomerBean forestbean:beans) {
			if(forestbean.getCustomerId()==bean.getCustomerId())
			{
				return false;
			}
		}
		beans.add(bean);
		return true;
	}

	@Override
	public boolean modify(int customerId) {
		for(CustomerBean customerBean:beans) {
			if(customerBean.getCustomerId()==customerId) {

				System.out.println("choose feild to be modified\n1.Customername\n2.street1\n3.sreet2\n4.town\n5.postalcode\n6.email\n7.telephonenumber\n8.CustomerMain\n");
				int c=sc.nextInt();
				switch(c) {
				case 1:
					boolean flag;
					do {
						String nameregexpr="^[A-Z][a-z]*";
						System.out.println("enter customer name to be modified");
						System.out.println("Enter the name in capitalised format");
						String customerName=sc.next();
						flag=customerName.matches(nameregexpr);
						if(!flag)
							System.out.println("Invalid...Please Enter alphabets only");
						else {
							customerBean.setCustomerName(customerName);
						}
					}while(!flag);

					break;
				case 2:boolean addmatcher;
				do {
					System.out.println("enter street adress1 to be modified");
					String streetAdress1=sc.next();

					String regexp="^[#.0-9a-zA-Z/s,-]+$";

					addmatcher=streetAdress1.matches(regexp);

					if(!addmatcher) 
						System.out.println("Invalid adress");

					else {
						customerBean.setStreetAdress1(streetAdress1);

					}
				}while(!addmatcher);

				break;
				case 3:boolean addmatcher1;
				do {
					System.out.println("enter street adress2 to be modified");
					String streetAdress2=sc.next();

					String regexp="^[0-9A-Za-z]*";

					addmatcher1=streetAdress2.matches(regexp);

					if(!addmatcher1) 
						System.out.println("Invalid adress");


					else {
						customerBean.setStreetAdress2(streetAdress2);

					}
				}while(!addmatcher1);

				break;
				case 4:
					boolean townmatcher;
					do {
						System.out.println("enter customer town");
						String town=sc.next();
						String townregexpr="^[A-Za-z]*";

						townmatcher=town.matches(townregexpr);

						if(!townmatcher) 
							System.out.println("Invalid town name");
						else {
							customerBean.setTown(town);

						}
					}while(!townmatcher);
					break;
				case 5:

					boolean postmatcher;
					do {
						System.out.println("enter postal code to be modified");
						int postalCode=sc.nextInt();
						String postalcode1=Integer.toString(postalCode);
						String post1="^[1-9][0-9]{5}$";
						//String post1="^[1-9]{1}[0-9]{2}\s{0,1}[0,9]{3}$";
						postmatcher=postalcode1.matches(post1);
						if(!postmatcher) 
							System.out.println("Invalid postal code");

						else {
							customerBean.setPostalCode(postalCode);
						}
					}while(!postmatcher);


					break;
				case 6:
					boolean emailmatcher;
					do {
						System.out.println("enter customer email to be modified");
						String email =sc.next();

						String email1="^(.+)@(.+)$";
						emailmatcher=email.matches(email1);

						if(!emailmatcher) 
							System.out.println("Invalid Email");
						else {
							customerBean.setEmail(email);

						}

					}while(!emailmatcher);
					break;
				case 7:
					boolean nummatcher;
					do {
						System.out.println("enter customer telephone to be modified");
						long telephoneNumber=sc.nextLong();
						String num=Long.toString(telephoneNumber);
						//String phoneNumber="^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
						String phoneNumber="^[6-9][0-9]{9}$";
						nummatcher=num.matches(phoneNumber);

						if(!nummatcher) 
							System.out.println("Invalid number...");

						else {
							customerBean.setTelephoneNumber(telephoneNumber);
						}
					}
					while(!nummatcher);
					break;
				default:
					break;
				}

			}

			return true;
		}
		return false;
	}

	@Override
	public boolean customerLogin(CustomerBean bean) {


		for(CustomerBean customer:beans)
		{
			if(customer.getCustomerId()==bean.getCustomerId())
			{
				return false;
			}

		}
		beans.add(bean);


		return true;

	}


}
