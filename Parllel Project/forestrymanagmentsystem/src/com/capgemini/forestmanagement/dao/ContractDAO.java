package com.capgemini.forestmanagement.dao;

import java.util.List;

import com.capgemini.forestrymanagement.bean.ContractBean;


public interface ContractDAO {
	public List<ContractBean> getAllContracts();
	public boolean deleteContract(int contractNo);
	public boolean addContract(ContractBean bean);
	


}
