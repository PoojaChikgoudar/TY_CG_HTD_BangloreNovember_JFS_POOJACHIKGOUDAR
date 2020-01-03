package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.HaulierDao;
import com.capgemini.hybernet.dao.OrderDao;
import com.capgemini.hybernet.dto.Haulier;
import com.capgemini.hybernet.factory.HaulierManager;
import com.capgemini.hybernet.factory.OrderManager;

public class HaulierServiceImpl implements HaulierService  {
	HaulierDao dao=HaulierManager.instanceOfHaulierDAOImpl();
	public List<Haulier> getAllHaulier() {
		// TODO Auto-generated method stub
		return dao.getAllHaulier();
	}

	public boolean add(Haulier user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	public boolean modify(int haulier_id, Haulier bean) {
		// TODO Auto-generated method stub
		return dao.modify(haulier_id, bean);
	}

	public boolean deletehaulier(int haulier_id) {
		// TODO Auto-generated method stub
		return dao.deletehaulier(haulier_id);
	}

}
