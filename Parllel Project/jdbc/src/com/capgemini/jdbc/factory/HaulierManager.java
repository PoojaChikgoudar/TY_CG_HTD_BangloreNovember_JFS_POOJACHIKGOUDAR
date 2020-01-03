package com.capgemini.jdbc.factory;


import com.capgemini.jdbc.dao.HaulierDAOImpl;
import com.capgemini.jdbc.dao.HaulierDao;

import com.mysql.jdbc.services.HaulierService;
import com.mysql.jdbc.services.HaulierServiceImpl;

public class HaulierManager {
	public static HaulierDao instanceOfHaulierDAOImpl() {
		HaulierDao dao= new HaulierDAOImpl();
		return dao;
		
	}
	public static HaulierService instanceOfHaulierService() {
		HaulierService service=new HaulierServiceImpl();
		 return service;
		 
		
	}


}
