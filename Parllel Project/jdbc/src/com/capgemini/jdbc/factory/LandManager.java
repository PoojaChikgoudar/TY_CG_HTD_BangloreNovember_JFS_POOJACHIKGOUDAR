package com.capgemini.jdbc.factory;


import com.capgemini.jdbc.dao.LandDAO;
import com.capgemini.jdbc.dao.LandDAOImpl;

import com.mysql.jdbc.services.LandService;
import com.mysql.jdbc.services.LandServiceImpl;

public class LandManager {
	public static LandDAO instanceOfLandDAOImpl() {
		LandDAO dao= new LandDAOImpl();
		return dao;
		
	}
	public static LandService instanceOfLandService() {
		LandService service=new LandServiceImpl();
		 return service;
		 
		
	}


}
