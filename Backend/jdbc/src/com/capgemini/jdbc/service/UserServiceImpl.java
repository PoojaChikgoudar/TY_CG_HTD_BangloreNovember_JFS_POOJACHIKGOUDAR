package com.capgemini.jdbc.service;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServiceImpl implements UserServices {
     
	UserDAO dao=UserFactory.instanceofUserDAOImpl();
	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return dao.userLogin(username, password);
	}

	@Override
	public boolean updateUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.updateUser(user);
	}

	@Override
	public boolean insertUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	@Override
	public boolean deleteUser(UserBean user) {
		// TODO Auto-generated method stub
		 return dao.deleteUser(user);
	}

	

}
