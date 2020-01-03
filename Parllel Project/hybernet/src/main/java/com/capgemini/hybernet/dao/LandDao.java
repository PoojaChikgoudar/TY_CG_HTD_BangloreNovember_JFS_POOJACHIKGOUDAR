package com.capgemini.hybernet.dao;

import java.util.List;

import com.capgemini.hybernet.dto.Land;



public interface LandDao {
	public List<Land> getAllLandDetails();
	public boolean delete(int landId);
	public boolean add(Land bean);
	public boolean modify(int landId,Land bean);
	


}
