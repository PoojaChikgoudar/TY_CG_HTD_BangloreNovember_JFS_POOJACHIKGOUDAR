package com.capgemini.jdbc.dao;

import com.capgemini.jdbc.bean.AdminBean;

public interface AdminDAO {
	public boolean signUp(AdminBean bean);
 public AdminBean adminLogin(String name,String password);
 
}
