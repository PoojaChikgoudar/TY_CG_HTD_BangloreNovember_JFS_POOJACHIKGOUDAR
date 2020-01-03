package com.capgemini.jdbc.dao;
//import java.util.List;

import java.util.List;

import com.capgemini.jdbc.bean.CustomerBean;
public interface CustomerDAO<UserBean> {
	public List<CustomerBean> getAllCustomers();
	public boolean add(CustomerBean user);
    public boolean modify(int customerId,CustomerBean bean);
	public boolean deleteUser(int customerId);
	
	
	
	

}
