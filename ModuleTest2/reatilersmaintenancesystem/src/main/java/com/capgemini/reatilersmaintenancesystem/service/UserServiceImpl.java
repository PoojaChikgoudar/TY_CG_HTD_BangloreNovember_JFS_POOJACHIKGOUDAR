package com.capgemini.reatilersmaintenancesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.reatilersmaintenancesystem.dao.UserInfoDao;
import com.capgemini.reatilersmaintenancesystem.dto.Authentication;
import com.capgemini.reatilersmaintenancesystem.dto.UserInfo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserInfoDao dao;

	@Override
	public boolean addUser(UserInfo user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public UserInfo getUsers(int id) {
		// TODO Auto-generated method stub
		return dao.getUsers(id);
	}

	@Override
	public List<UserInfo> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

	@Override
	public boolean modifyPassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.modifyPassword(id, password);
	}

	@Override
	public boolean register(Authentication account) {
		// TODO Auto-generated method stub
		return dao.register(account);
	}

	@Override
	public Authentication login(Authentication credentials) {
		// TODO Auto-generated method stub
		return dao.login(credentials);
	}

}
