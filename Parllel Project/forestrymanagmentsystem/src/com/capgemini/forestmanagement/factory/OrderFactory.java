package com.capgemini.forestmanagement.factory;


import com.capgemini.forestmanagement.dao.OrderDAO;
import com.capgemini.forestmanagement.dao.OrderDAOImpl;

public class OrderFactory {
	public static OrderDAO getOrderDAO() {
		return new OrderDAOImpl();
		
	}

}
