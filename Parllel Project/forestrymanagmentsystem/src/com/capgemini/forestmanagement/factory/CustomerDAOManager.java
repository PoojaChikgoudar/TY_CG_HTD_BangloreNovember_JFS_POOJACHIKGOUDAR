package com.capgemini.forestmanagement.factory;

import com.capgemini.forestmanagement.dao.CustomerDAO;
import com.capgemini.forestmanagement.dao.CustomerDAOImpl;

public class CustomerDAOManager {
	public static CustomerDAO getForestDAO() {
		return new CustomerDAOImpl();
		
	}

}
