package com.capgemini.forestmanagement.factory;


import com.capgemini.forestmanagement.dao.SchedulerDao;
import com.capgemini.forestmanagement.dao.SchedulerDaoImpl;

public class SchedularManager {
	public static SchedulerDao getSchedularDAO() {
		return new SchedulerDaoImpl();
		
	}

}
