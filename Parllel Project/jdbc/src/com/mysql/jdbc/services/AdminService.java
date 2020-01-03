package com.mysql.jdbc.services;

import com.capgemini.jdbc.bean.AdminBean;

public interface AdminService {
	public boolean signUp(AdminBean bean);
	public AdminBean adminLogin(String name,String password);
}
