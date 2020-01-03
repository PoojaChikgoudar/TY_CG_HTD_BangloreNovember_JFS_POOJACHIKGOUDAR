package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.OrderBean;

import com.capgemini.jdbc.dao.OrderDao;
import com.capgemini.jdbc.factory.OrderManager;


public class OrderServiceImpl implements OrderService {
	 OrderDao dao=OrderManager.instanceOfOrderDAOImpl();
	@Override
	public List<OrderBean> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return dao.getAllOrderDetails();
	}

	@Override
	public boolean add(OrderBean order) {
		// TODO Auto-generated method stub
		return dao.add(order);
	}

	@Override
	public boolean modify(int orderid, OrderBean bean) {
		// TODO Auto-generated method stub
		return dao.modify(orderid, bean);
	}

	@Override
	public boolean delete(int orderid) {
		// TODO Auto-generated method stub
		return dao.delete(orderid);
	}

}
