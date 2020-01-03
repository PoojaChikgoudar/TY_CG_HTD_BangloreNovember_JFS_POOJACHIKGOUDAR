package com.capgemini.hybernet.factory;


import com.capgemini.hybernet.dao.OrderDao;
import com.capgemini.hybernet.dao.OrderDaoImpl;
import com.capgemini.hybernet.service.OrderService;
import com.capgemini.hybernet.service.OrderServiceImpl;


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
