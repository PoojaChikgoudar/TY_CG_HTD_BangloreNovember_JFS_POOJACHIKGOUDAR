package com.capgemini.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagement.bean.ClientBean;
import com.capgemini.forestrymanagement.bean.ContractBean;
import com.capgemini.forestrymanagement.bean.CustomerBean;
import com.capgemini.forestrymanagement.bean.LandBean;
import com.capgemini.forestrymanagement.bean.ProductBean;


public class ClientDAOImpl implements ClientDAO {
	Scanner sc=new Scanner(System.in);

	private static List<ClientBean> beans=new ArrayList<ClientBean>();

	@Override
	public List<ClientBean> getAllClients() {
		// TODO Auto-generated method stub
		return beans;
	}

	@Override
	public ClientBean getClientDetails(int clientId) {
		for(ClientBean clientBean:beans) {
			if(clientBean.getClientId()==clientId) {
				return clientBean;
			}

		}
		return null;
	}

	@Override
	public boolean delete(int clientId) {
		for(ClientBean clientBean:beans) {
			ClientBean bean=null;
			if(clientBean.getClientId()==clientId) {
       			bean=clientBean;
				
			}

		if(bean!=null) {
			beans.remove(bean);
			return true;
			}
		}
		return false;
	}

	@Override
	public boolean add(ClientBean bean) {
		for(ClientBean clientBean:beans) {
			if(clientBean.getClientId()==bean.getClientId())
			{
				return false;
			}
		}
		beans.add(bean);
		return true;
		
	}
		

	@Override
	public boolean modify(int clientId) {
		for(ClientBean clientBean:beans) {
			if(clientBean.getClientId()==clientId) {
				
				System.out.println("choose feild to be modified\n1.clientname\n2.email\n3.password\n");
				int c=sc.nextInt();
				switch(c) {
				case 1:boolean flag;
				do {
					String nameregexpr="^[A-Z][a-z]*";
				System.out.println("enter customer name to be modified");
				System.out.println("Enter the name in capitalised format");
				String clientName=sc.next();
				flag=clientName.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					clientBean.setClientName(clientName);
				}
				}while(!flag);
				break;
				case 2:
				boolean passwordmatcher;
				do {
				System.out.println("enter client password to be modified");
				System.out.println("password must contain atleast one lowercase letter one uppercase one number and one special character");
				String password =sc.next();
					
				String email1="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
				passwordmatcher=password.matches(email1);
				
				if(!passwordmatcher) 
					System.out.println("Invalid password");
				
					
				else {
					clientBean.setPassword(password);
					
					}

					}while(!passwordmatcher);
				
				case 3:
				boolean emailmatcher;
				do {
				System.out.println("enter client email");
				String email =sc.next();
					
				String email1="^(.+)@(.+)$";
				emailmatcher=email.matches(email1);
				
				if(!emailmatcher) 
					System.out.println("Invalid Email");
				
					
				else {
					clientBean.setClientEmail(email);
					
					}

					}while(!emailmatcher);
				
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
	public boolean clientLogin(String ClientName,String password ) {
		for(ClientBean client:beans) {
			if(client.getClientName().equals(ClientName)) {
				if(client.getPassword().equals(password)) {
					System.out.println("Correct credentials...");
					return true;
				}
			}
		}
		
		System.out.println("Wrong username and password....");
		
		
		return false;
	}

	

}
