package com.capgemini.forestmanagement.factory;

import com.capgemini.forestmanagement.dao.AdminDAO;
import com.capgemini.forestmanagement.dao.AdminDAOImpl;


public class AdminManager {
	public static AdminDAO getAdminDAO() {
		return new AdminDAOImpl();
		
	}

}
