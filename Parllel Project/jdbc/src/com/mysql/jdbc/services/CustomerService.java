package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.CustomerBean;

public interface CustomerService {
	public List<CustomerBean> getAllCustomers();
	public boolean add(CustomerBean user);
    public boolean modify(int customerId,CustomerBean bean);
	boolean deleteUser(int customerId);
	
}
