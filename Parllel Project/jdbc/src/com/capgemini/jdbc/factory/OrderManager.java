package com.capgemini.jdbc.factory;


import com.capgemini.jdbc.dao.OrderDao;
import com.capgemini.jdbc.dao.OrderDaoImpl;
import com.mysql.jdbc.services.OrderService;
import com.mysql.jdbc.services.OrderServiceImpl;


public class OrderManager {
	public static OrderDao instanceOfOrderDAOImpl() {
		OrderDao dao= new OrderDaoImpl();
		return dao;
		
	}
	public static OrderService instanceOfOrderService() {
		OrderService service=new OrderServiceImpl();
		 return service;
		 
		
	}

}
