package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.CustomerBean;
import com.capgemini.jdbc.dao.CustomerDAO;
import com.capgemini.jdbc.factory.CustomerDAOManager;

public class CustomerServiceImpl implements CustomerService {
	 CustomerDAO dao=CustomerDAOManager.instanceOfCustomerDAOImpl();
	@Override
	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public boolean add(CustomerBean user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	@Override
	public boolean modify(int customerId,CustomerBean bean) {
		// TODO Auto-generated method stub
		return dao.modify(customerId,bean);
	}

	@Override
	public boolean deleteUser(int customerId) {
		// TODO Auto-generated method stub
		return dao.deleteUser(customerId);
	}

	
}
