package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.Haulier;

public interface HaulierService {
	public List<Haulier> getAllHaulier();
	public boolean add(Haulier user);
    public boolean modify(int haulier_id,Haulier bean);
	public boolean deletehaulier(int haulier_id);

}
