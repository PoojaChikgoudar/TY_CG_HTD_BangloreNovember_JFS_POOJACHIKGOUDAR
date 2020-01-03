package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.ContractBean;

public interface ContractService {
	public List<ContractBean> getAllContracts();
	public boolean add(ContractBean user);
    public boolean modify(int contractno,ContractBean user);
	public boolean deleteUser(int contractno);
	

}
