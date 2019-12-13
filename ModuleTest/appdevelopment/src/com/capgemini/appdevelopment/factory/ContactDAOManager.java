package com.capgemini.appdevelopment.factory;

import com.capgemini.appdevelopment.dao.ContactDAO;
import com.capgemini.appdevelopment.dao.ContactDAOImpl;
import com.capgemini.appdevelopment.service.ContactService;
import com.capgemini.appdevelopment.service.ContactServiceImpl;

public class ContactDAOManager {
	public static ContactDAO instanceOfContactDAOImpl() {
		ContactDAO dao= new ContactDAOImpl();
		return dao;
		
	}
	public static ContactService instanceOfContactServiceImpl() {
		ContactService service= new ContactServiceImpl();
		return service;
		
	}

}
