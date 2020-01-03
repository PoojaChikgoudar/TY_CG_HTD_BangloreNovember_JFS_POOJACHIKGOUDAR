package com.capgemini.forestmanagement.dao;

import java.util.List;

import com.capgemini.forestrymanagement.bean.OrderBean;


public interface OrderDAO {
	public List<OrderBean> getAllOrderDetails();
	public OrderBean getOrderDetails(int orderId);
	public boolean delete(int orderId);
	public boolean add(OrderBean bean);
	public boolean modify(int orderId);
}
