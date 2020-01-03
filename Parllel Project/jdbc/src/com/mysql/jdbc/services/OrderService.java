package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.OrderBean;

public interface OrderService {
	public List<OrderBean> getAllOrderDetails();
	public boolean add(OrderBean order);
    public boolean modify(int orderid,OrderBean bean);
	public boolean delete(int orderid);
}
