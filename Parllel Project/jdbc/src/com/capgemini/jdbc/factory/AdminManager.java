package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.AdminDAO;
import com.capgemini.jdbc.dao.AdminDAOImpl;
import com.mysql.jdbc.services.AdminService;
import com.mysql.jdbc.services.AdminServiceImpl;


public class AdminManager {
	public static AdminDAO instanceOfAdminDAOImpl() {
		AdminDAO dao= new AdminDAOImpl();
		return dao;
		
	}
	public static AdminService instanceOfAdminService() {
		AdminService service=new AdminServiceImpl();
		 return service;
		 
		
	}

}
