package com.capgemini.forestmanagement.factory;


import com.capgemini.forestmanagement.dao.HaulierDAO;
import com.capgemini.forestmanagement.dao.HaulierDAOImpl;

public class HaulierFactory {
	public static HaulierDAO getHaulierDAO() {
		return new HaulierDAOImpl();
		
	}


}
