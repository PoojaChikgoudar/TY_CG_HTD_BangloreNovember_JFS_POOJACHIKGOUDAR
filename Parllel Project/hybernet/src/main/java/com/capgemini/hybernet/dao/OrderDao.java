package com.capgemini.hybernet.dao;

import java.util.List;

import com.capgemini.hybernet.dto.Order;


public interface OrderDao {
	public List<Order> getAllOrderDetails();
	public boolean add(Order order);
    public boolean modify(int orderid,Order bean);
	public boolean delete(int orderid);

}
