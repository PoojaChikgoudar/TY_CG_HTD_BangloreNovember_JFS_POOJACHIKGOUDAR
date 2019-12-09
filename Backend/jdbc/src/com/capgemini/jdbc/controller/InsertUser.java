package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.service.UserServices;

public class InsertUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    UserServices services=UserFactory.instanceOfUserServices();
    UserBean user=new UserBean();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter user_id...");
    user.setUser_id(Integer.parseInt(sc.nextLine()));
    System.out.println("enter username");
    user.setUsername(sc.nextLine());
    System.out.println("enter usermail");
    user.setUsermail(sc.nextLine());
    System.out.println("enter password");
    user.setPassword(sc.nextLine());
    
   
    
    
    if(services.insertUser(user)) {
    	System.out.println("User inserted....");
    }else {
    	System.out.println("something went wrong");
    }
    sc.close();
    
	}

}
