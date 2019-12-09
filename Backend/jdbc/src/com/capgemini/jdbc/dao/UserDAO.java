package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO {
	public List<UserBean> getAllUsers();
	public UserBean userLogin(String username,String password);
   // public boolean updateUser(int user_id,String password,String usermail);
    public boolean insertUser(UserBean user);
   // public boolean deleteUser(int user_id,String password);
	public boolean deleteUser(UserBean user);
	public boolean updateUser(UserBean user);
}
