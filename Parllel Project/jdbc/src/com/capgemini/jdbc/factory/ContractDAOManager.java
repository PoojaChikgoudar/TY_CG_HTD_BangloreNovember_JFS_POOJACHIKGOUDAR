package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.ContractDAO;
import com.capgemini.jdbc.dao.ContractDAOImpl;

import com.mysql.jdbc.services.ContractService;
import com.mysql.jdbc.services.ContractServiceImpl;


public class ContractDAOManager {
	public static ContractDAO instanceOfContractDAOImpl() {
		ContractDAO dao= new ContractDAOImpl();
		return dao;
		
	}
	public static ContractService instanceOfContractService() {
		ContractService service=new ContractServiceImpl();
		 return service;
		 
		
	}

}
