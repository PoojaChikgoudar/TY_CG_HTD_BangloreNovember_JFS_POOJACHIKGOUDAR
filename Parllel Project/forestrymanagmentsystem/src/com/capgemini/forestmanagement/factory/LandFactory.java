package com.capgemini.forestmanagement.factory;


import com.capgemini.forestmanagement.dao.LandDAOImpl;
import com.capgemini.forestmanagement.dao.LandDAO;

public class LandFactory {
	public static LandDAO getLandDAO() {
		return new LandDAOImpl();
		
	}
}
