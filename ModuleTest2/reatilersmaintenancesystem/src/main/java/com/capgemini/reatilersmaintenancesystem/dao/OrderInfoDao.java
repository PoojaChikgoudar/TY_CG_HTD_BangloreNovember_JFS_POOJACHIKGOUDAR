package com.capgemini.reatilersmaintenancesystem.dao;

import java.util.List;

import com.capgemini.reatilersmaintenancesystem.dto.OrderInfo;



public interface OrderInfoDao {
public boolean addOrder(OrderInfo order);
	
	public OrderInfo getOrder(int id);
	
	public List<OrderInfo> getAllOrders();
	
	public boolean deleteOrder(int id);

}
