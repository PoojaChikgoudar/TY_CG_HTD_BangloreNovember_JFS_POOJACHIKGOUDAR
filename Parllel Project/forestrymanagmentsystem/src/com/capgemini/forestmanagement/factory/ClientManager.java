package com.capgemini.forestmanagement.factory;


import com.capgemini.forestmanagement.dao.ClientDAO;
import com.capgemini.forestmanagement.dao.ClientDAOImpl;

public class ClientManager {
	public static ClientDAO getClientDAO() {
		return new ClientDAOImpl();
		
	}


}
