package com.capgemini.forestmanagement.dao;

import java.util.InputMismatchException;
import java.util.List;

import com.capgemini.forestrymanagement.bean.CustomerBean;


public interface CustomerDAO {
	public List<CustomerBean> getAllCustomers();
	public CustomerBean getCustomer(int customerId);
	public boolean deleteCustomer(int customerId) throws InputMismatchException;
	public boolean addCustomer(CustomerBean bean);
	public boolean modify(int customerId);
	public boolean customerLogin(CustomerBean bean);
	
	
	
	

}
