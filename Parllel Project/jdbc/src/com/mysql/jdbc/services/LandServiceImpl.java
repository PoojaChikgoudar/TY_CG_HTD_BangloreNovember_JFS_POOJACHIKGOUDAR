package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.LandBean;

import com.capgemini.jdbc.dao.LandDAO;

import com.capgemini.jdbc.factory.LandManager;

public class LandServiceImpl implements LandService {
	LandDAO dao=LandManager.instanceOfLandDAOImpl();
	@Override
	public List<LandBean> getAllLandDetails() {
		// TODO Auto-generated method stub
		return dao.getAllLandDetails();
	}

	@Override
	public boolean delete(int landId) {
		// TODO Auto-generated method stub
		return dao.delete(landId);
	}

	@Override
	public boolean add(LandBean bean) {
		// TODO Auto-generated method stub
		return dao.add(bean);
	}

	@Override
	public boolean modify(int landId, LandBean bean) {
		// TODO Auto-generated method stub
		return dao.modify(landId, bean);
	}

}
