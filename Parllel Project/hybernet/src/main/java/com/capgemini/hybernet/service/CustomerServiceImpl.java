package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.CustomerDao;

import com.capgemini.hybernet.dto.CustomerBean;
import com.capgemini.hybernet.factory.CustomerManager;


public class CustomerServiceImpl implements  CustomerService {
	CustomerDao dao=CustomerManager.instanceOfCustomerDAOImpl();
	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(CustomerBean user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	public boolean modify(int customerId, CustomerBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int customerId) {
		// TODO Auto-generated method stub
		return dao.deleteUser(customerId);
	}

}