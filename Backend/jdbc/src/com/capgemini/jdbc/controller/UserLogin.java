package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.service.UserServices;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserServices services=UserFactory.instanceOfUserServices();
		    UserBean user=new UserBean();
		    Scanner sc=new Scanner(System.in);
		    
		    System.out.println("enter username...");
		    user.setUsername(sc.nextLine());
		   
		    System.out.println("enter password");
		    user.setPassword(sc.nextLine());
		    UserBean user1=services.userLogin(user.getUsername(),user.getPassword());
		   
		    
		    
		    if(user1!=null) {
		    	System.out.println("user_id is "+user1.getUser_id());
		    	System.out.println("username is "+user1.getUsername());
		    	System.out.println("email is "+user1.getUsermail());
		    }else {
		    	System.out.println("something went wrong");
		    }
		    sc.close();
		    
			}

	}


