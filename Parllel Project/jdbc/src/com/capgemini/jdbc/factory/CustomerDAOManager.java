package com.capgemini.jdbc.factory;



import com.capgemini.jdbc.dao.CustomerDAO;
import com.capgemini.jdbc.dao.CustomerDAOImpl;
import com.mysql.jdbc.services.CustomerService;
import com.mysql.jdbc.services.CustomerServiceImpl;

public class CustomerDAOManager {
	public static CustomerDAO instanceOfCustomerDAOImpl() {
		CustomerDAO dao= new CustomerDAOImpl();
		return dao;
		
	}
	public static CustomerService instanceOfCustomerService() {
		 CustomerService service=new CustomerServiceImpl();
		 return service;
		 
		
	}

}
