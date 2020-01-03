package com.mysql.jdbc.services;

import com.capgemini.jdbc.bean.AdminBean;
import com.capgemini.jdbc.dao.AdminDAO;
import com.capgemini.jdbc.factory.AdminManager;

public class AdminServiceImpl implements AdminService {
	AdminDAO dao=AdminManager.instanceOfAdminDAOImpl();
	@Override
	public AdminBean adminLogin(String name, String password) {
		// TODO Auto-generated method stub
		return dao.adminLogin(name, password);
	}
	@Override
	public boolean signUp(AdminBean bean) {
		// TODO Auto-generated method stub
		return dao.signUp(bean);
	}

}
