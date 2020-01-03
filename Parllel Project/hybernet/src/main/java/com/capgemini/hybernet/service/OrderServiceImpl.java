package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.OrderDao;
import com.capgemini.hybernet.dto.Order;
import com.capgemini.hybernet.factory.OrderManager;

public class OrderServiceImpl implements OrderService {
	OrderDao dao=OrderManager.instanceOfOrderDAOImpl();
	public List<Order> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return dao.getAllOrderDetails();
	}

	public boolean add(Order order) {
		// TODO Auto-generated method stub
		return dao.add(order);
	}

	public boolean modify(int orderid, Order bean) {
		// TODO Auto-generated method stub
		return dao.modify(orderid, bean);
	}

	public boolean delete(int orderid) {
		// TODO Auto-generated method stub
		return dao.delete(orderid);
	}

}
