package com.capgemini.jdbc.service;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices {
	public List<UserBean> getAllUsers();
	public UserBean userLogin(String username,String password);
    public boolean updateUser(UserBean user);
    public boolean insertUser(UserBean user);
    //public boolean deleteUser(int user_id,String password);
	public boolean deleteUser(UserBean user);
	
}
