package com.capgemini.hybernet.factory;


import com.capgemini.hybernet.dao.LandDao;
import com.capgemini.hybernet.dao.LandDaoImpl;

import com.capgemini.hybernet.service.LandService;
import com.capgemini.hybernet.service.LandServiceImpl;

public class LandManager {
	public static LandDao instanceOfLandDAOImpl() {
		LandDao dao= new LandDaoImpl();
		return dao;
		
	}
	public static LandService instanceOfLandService() {
		LandService service=new LandServiceImpl();
		 return service;
		 
		
	}
	

}
