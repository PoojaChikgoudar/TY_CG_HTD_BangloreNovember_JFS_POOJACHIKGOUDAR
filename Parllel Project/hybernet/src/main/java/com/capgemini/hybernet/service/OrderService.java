package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.Order;

public interface OrderService {
	public List<Order> getAllOrderDetails();
	public boolean add(Order order);
    public boolean modify(int orderid,Order bean);
	public boolean delete(int orderid);

}
