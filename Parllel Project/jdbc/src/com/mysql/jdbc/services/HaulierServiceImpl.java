package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.HaulierBean;

import com.capgemini.jdbc.dao.HaulierDao;
import com.capgemini.jdbc.factory.HaulierManager;


public class HaulierServiceImpl implements HaulierService{
	HaulierDao dao=HaulierManager.instanceOfHaulierDAOImpl();
	@Override
	public List<HaulierBean> getAllHaulier() {
		// TODO Auto-generated method stub
		return dao.getAllHaulier();
	}

	@Override
	public boolean add(HaulierBean user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	@Override
	public boolean modify(int haulier_id, HaulierBean bean) {
		// TODO Auto-generated method stub
		return dao.modify(haulier_id, bean);
	}

	@Override
	public boolean deletehaulier(int haulier_id) {
		// TODO Auto-generated method stub
		return dao.deletehaulier(haulier_id);
	}

}
