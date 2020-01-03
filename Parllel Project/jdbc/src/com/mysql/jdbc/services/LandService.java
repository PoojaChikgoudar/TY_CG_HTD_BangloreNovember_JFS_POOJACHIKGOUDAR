package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.LandBean;

public interface LandService {
	public List<LandBean> getAllLandDetails();
	public boolean delete(int landId);
	public boolean add(LandBean bean);
	public boolean modify(int landId,LandBean bean);
	

}
