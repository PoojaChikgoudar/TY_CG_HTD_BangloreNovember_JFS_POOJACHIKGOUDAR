package com.capgemini.hybernet.factory;

import com.capgemini.hybernet.dao.CustomerDao;
import com.capgemini.hybernet.dao.CustomerDaoImpl;
import com.capgemini.hybernet.service.CustomerService;
import com.capgemini.hybernet.service.CustomerServiceImpl;


public class CustomerManager {
	public static CustomerDao instanceOfCustomerDAOImpl() {
		CustomerDao dao= new CustomerDaoImpl();
		return dao;
		
	}
	public static CustomerService instanceOfCustomerService() {
		 CustomerService service=new CustomerServiceImpl();
		 return service;
		 
		
	}

}
