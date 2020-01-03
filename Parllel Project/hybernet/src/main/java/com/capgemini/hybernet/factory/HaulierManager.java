package com.capgemini.hybernet.factory;


import com.capgemini.hybernet.dao.HaulierDao;
import com.capgemini.hybernet.dao.HaulierDaoImpl;

import com.capgemini.hybernet.service.HaulierService;
import com.capgemini.hybernet.service.HaulierServiceImpl;

public class HaulierManager {
	public static HaulierDao instanceOfHaulierDAOImpl() {
		HaulierDao dao= new HaulierDaoImpl();
		return dao;
		
	}
	public static HaulierService instanceOfHaulierService() {
		HaulierService service=new HaulierServiceImpl();
		 return service;
		 
		
	}
	

}
