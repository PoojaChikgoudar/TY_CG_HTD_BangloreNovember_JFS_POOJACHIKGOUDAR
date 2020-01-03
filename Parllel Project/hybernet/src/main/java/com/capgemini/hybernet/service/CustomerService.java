package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.CustomerBean;

public interface CustomerService {
	public List<CustomerBean> getAllCustomers();
	public boolean add(CustomerBean user);
    public boolean modify(int customerId,CustomerBean bean);
	public boolean deleteUser(int customerId);

}
