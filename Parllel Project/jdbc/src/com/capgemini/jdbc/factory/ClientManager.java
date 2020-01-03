package com.capgemini.jdbc.factory;


import com.capgemini.jdbc.dao.ClientDao;
import com.capgemini.jdbc.dao.ClientDaoImpl;

import com.mysql.jdbc.services.ClientService;
import com.mysql.jdbc.services.ClientServiceImpl;

public class ClientManager {
	public static ClientDao instanceOfClientDAOImpl() {
		ClientDao dao= new ClientDaoImpl();
		return dao;
		
	}
	public static ClientService instanceOfClientService() {
		ClientService service=new ClientServiceImpl();
		 return service;
		 
		
	}


}
