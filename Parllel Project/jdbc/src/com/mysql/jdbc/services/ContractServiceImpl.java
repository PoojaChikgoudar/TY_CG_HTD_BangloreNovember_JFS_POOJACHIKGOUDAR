package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.ContractBean;
import com.capgemini.jdbc.dao.ContractDAO;

import com.capgemini.jdbc.factory.ContractDAOManager;


public class ContractServiceImpl implements ContractService {
	 ContractDAO dao=ContractDAOManager.instanceOfContractDAOImpl();

	@Override
	public boolean add(ContractBean user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	@Override
	public boolean modify(int contractno,ContractBean user) {
		// TODO Auto-generated method stub
		return dao.modify(contractno, user);
	}

	@Override
	public boolean deleteUser(int contractno) {
		// TODO Auto-generated method stub
		return dao.deleteUser(contractno);
	}

	@Override
	public List<ContractBean> getAllContracts() {
		// TODO Auto-generated method stub
		return dao.getAllContracts();
	}

}
