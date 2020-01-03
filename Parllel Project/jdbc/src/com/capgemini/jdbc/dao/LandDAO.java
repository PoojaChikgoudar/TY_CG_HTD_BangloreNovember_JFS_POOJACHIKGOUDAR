package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.LandBean;




public interface LandDAO {
	public List<LandBean> getAllLandDetails();
	public boolean delete(int landId);
	public boolean add(LandBean bean);
	public boolean modify(int landId,LandBean bean);
	

}
