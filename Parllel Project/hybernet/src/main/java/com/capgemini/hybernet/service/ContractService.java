package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.Contract;

public interface ContractService {
	public List<Contract> getAllContracts();
	public boolean add(Contract user);
    public boolean modify(int contractno,Contract contract);
	public boolean delete(int contractno);
}
