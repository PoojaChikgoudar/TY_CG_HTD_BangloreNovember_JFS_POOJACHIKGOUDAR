package com.capgemini.hybernet.factory;

import com.capgemini.hybernet.dao.ClientDao;
import com.capgemini.hybernet.dao.ClientDaoImpl;

import com.capgemini.hybernet.service.ClientService;
import com.capgemini.hybernet.service.ClientServiceImpl;


public class ClientManager {
	public static ClientDao instanceOfClientDaoImpl() {
		ClientDao dao= new ClientDaoImpl();
		return dao;
		
	}
	public static ClientService instanceOfClientService() {
		ClientService service=new ClientServiceImpl();
		 return service;
		 
		
	}

}
