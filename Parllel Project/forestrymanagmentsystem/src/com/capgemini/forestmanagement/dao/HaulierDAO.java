package com.capgemini.forestmanagement.dao;

import java.util.List;


import com.capgemini.forestrymanagement.bean.HaulierBean;

public interface HaulierDAO {
	public List<HaulierBean> getAllHaulier();
	public HaulierBean gethaulier(int haulierid);
	public boolean delete(int haulierid);
	public boolean add(HaulierBean bean);
	public boolean modify(int haulierid);

}
