package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImpl;
import com.capgemini.jdbc.service.UserServiceImpl;
import com.capgemini.jdbc.service.UserServices;

public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDAO instanceofUserDAOImpl() {
		UserDAO dao= new UserDAOImpl();
		return dao;
	}
	
	public static UserServices instanceOfUserServices() {
		UserServices services=new UserServiceImpl();
		return services;
		
	}

}
