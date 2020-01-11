package com.capgemini.reatilersmaintenancesystem.dao;

import java.util.List;

import com.capgemini.reatilersmaintenancesystem.dto.Authentication;
import com.capgemini.reatilersmaintenancesystem.dto.UserInfo;

public interface UserInfoDao {
	public boolean addUser(UserInfo user);
	public UserInfo getUsers(int id);

	public List<UserInfo> getAllUsers();

	public boolean deleteUser(int id);

	public boolean modifyPassword(int id,String password);
	public boolean register(Authentication account);

	public Authentication login(Authentication credentials);

}
