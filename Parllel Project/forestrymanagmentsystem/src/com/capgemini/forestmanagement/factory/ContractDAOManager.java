package com.capgemini.forestmanagement.factory;

import com.capgemini.forestmanagement.dao.ContractDAO;
import com.capgemini.forestmanagement.dao.ContractDAOImpl;


public class ContractDAOManager {
	public static ContractDAO getForestDAO() {
		return new ContractDAOImpl();
		
	}

}
