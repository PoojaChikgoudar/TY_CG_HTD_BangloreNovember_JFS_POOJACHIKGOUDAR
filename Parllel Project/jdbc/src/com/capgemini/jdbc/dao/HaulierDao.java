package com.capgemini.jdbc.dao;

import java.util.List;


import com.capgemini.jdbc.bean.HaulierBean;

public interface HaulierDao {
	public List<HaulierBean> getAllHaulier();
	public boolean add(HaulierBean user);
    public boolean modify(int haulier_id,HaulierBean bean);
	public boolean deletehaulier(int haulier_id);

}
