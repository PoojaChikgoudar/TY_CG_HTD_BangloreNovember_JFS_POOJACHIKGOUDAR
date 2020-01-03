package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.ContractBean;


public interface ContractDAO {
	public List<ContractBean> getAllContracts();
	public boolean add(ContractBean user);
    public boolean modify(int contractno,ContractBean user);
	public boolean deleteUser(int contractno);
	

}
