package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.LandDao;

import com.capgemini.hybernet.dto.Land;
import com.capgemini.hybernet.factory.LandManager;


public class LandServiceImpl implements LandService {
	LandDao dao=LandManager.instanceOfLandDAOImpl();
	public List<Land> getAllLandDetails() {
		// TODO Auto-generated method stub
		return dao.getAllLandDetails();
	}

	public boolean delete(int landId) {
		// TODO Auto-generated method stub
		return dao.delete(landId);
	}

	public boolean add(Land bean) {
		// TODO Auto-generated method stub
		return dao.add(bean);
	}

	public boolean modify(int landId, Land bean) {
		// TODO Auto-generated method stub
		return dao.modify(landId, bean);
	}

}
