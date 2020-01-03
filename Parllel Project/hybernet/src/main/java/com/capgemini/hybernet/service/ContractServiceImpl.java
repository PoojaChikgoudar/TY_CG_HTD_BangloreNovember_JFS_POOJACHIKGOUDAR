package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.ContractDao;

import com.capgemini.hybernet.dto.Contract;
import com.capgemini.hybernet.factory.ContractManager;


public class ContractServiceImpl implements ContractService  {
	ContractDao dao=ContractManager.instanceOfContractDaoImpl();
	public List<Contract> getAllContracts() {
		// TODO Auto-generated method stub
		return dao.getAllContracts();
	}

	public boolean add(Contract user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	public boolean modify(int contractno, Contract contract) {
		// TODO Auto-generated method stub
		return dao.modify(contractno, contract);
	}

	public boolean delete(int contractno) {
		// TODO Auto-generated method stub
		return dao.delete(contractno);
	}

}
