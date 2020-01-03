package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.Land;

public interface LandService {
	public List<Land> getAllLandDetails();
	public boolean delete(int landId);
	public boolean add(Land bean);
	public boolean modify(int landId,Land bean);
	

}
