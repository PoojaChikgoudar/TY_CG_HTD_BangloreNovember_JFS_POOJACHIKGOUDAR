package com.capgemini.forestmanagement.dao;

import java.util.List;


import com.capgemini.forestrymanagement.bean.LandBean;

public interface LandDAO {
	public List<LandBean> getAllLandDetails();
	public boolean delete(int landId);
	public boolean add(LandBean bean);
	public boolean modify(int landId);
	public LandBean getlanddetails(int landId);

}
