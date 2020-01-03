package com.capgemini.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.capgemini.forestManagementSystem.controller.HaulierMain;

import com.capgemini.forestrymanagement.bean.HaulierBean;

public class HaulierDAOImpl implements HaulierDAO{
	private static List<HaulierBean> beans=new ArrayList<HaulierBean>();
	Scanner sc=new Scanner(System.in);
	@Override
	public List<HaulierBean> getAllHaulier() {
		// TODO Auto-generated method stub
		return beans;
	}

	@Override
	public HaulierBean gethaulier(int haulierid) {
		for(HaulierBean haulierBean:beans) {
			if(haulierBean.getHaulier_id()==haulierid) {
				return haulierBean;
			}

		}

		return null;
	}

	@Override
	public boolean delete(int haulierid) {
		for(HaulierBean haulierBean:beans) {
			HaulierBean bean=null;
			if(haulierBean.getHaulier_id()==haulierid) {
				bean=haulierBean;

			}

			if(bean!=null) {
				beans.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean add(HaulierBean bean) {
		for(HaulierBean bean1:beans) {
			if(bean1.getHaulier_id()==bean.getHaulier_id())
			{
				return false;
			}
		}
		beans.add(bean);
		return true;
	}

	@Override
	public boolean modify(int haulierid) {
		for(HaulierBean haulierBean:beans) {
			if(haulierBean.getHaulier_id()==haulierid) {
				
				System.out.println("choose feild to be modified\n1.Hauliername\n2.Address\n3.Email\n4.Telephone\n5.HaulierMain");
				int c=sc.nextInt();
				switch(c) {
				case 1:boolean flag;
				do {
					String nameregexpr="^[A-Z][a-z]*";
					System.out.println("enter haulier name to be modified");
				System.out.println("Enter the name in capitalised format");
				String haulerName=sc.next();
				flag=haulerName.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					haulierBean.setHaulier_name(haulerName);
				}
				}while(!flag);
				
				break;
				
				case 2:
				boolean addmatcher;
				do {
					System.out.println("enter  adress to be modified");
				String adress=sc.next();
				
				String regexp="^[0-9A-Za-z]*";
				
				 addmatcher=adress.matches(regexp);
				
				if(!addmatcher) 
					System.out.println("Invalid adress");
				
					
				else {
					haulierBean.setAdress(adress);
					
					}
				}while(!addmatcher);
				
				break;
				
				case 3:
				boolean emailmatcher;
				do {
				System.out.println("enter haulier email to be modified");
				String email =sc.next();
					
				String email1="^(.+)@(.+)$";
				emailmatcher=email.matches(email1);
				
				if(!emailmatcher) 
					System.out.println("Invalid Email");
				
					
				else {
					haulierBean.setEmail(email);
					
					}

					}while(!emailmatcher);
				
				break;
				
				
				case 4:boolean nummatcher;
				do {
					System.out.println("enter haulier telephone");
					long telephoneNumber=sc.nextLong();
					String num=Long.toString(telephoneNumber);
					String phoneNumber="^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
					nummatcher=num.matches(phoneNumber);
					
					if(!nummatcher) 
						System.out.println("Invalid number...");
					
						
					
					
					
					else {
						haulierBean.setTelephone(telephoneNumber);
						

						}
					}
					while(!nummatcher);
				break;
				//case 5:HaulierMain.main();
				//break;
				}
				
				}
			return true;
				
			}
			
			
			
		
		return false;
	}

}
