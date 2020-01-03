package com.capgemini.forestmanagement.dao;

import java.util.List;


import com.capgemini.forestrymanagement.bean.ClientBean;

public interface ClientDAO {
	public List<ClientBean> getAllClients();
	public ClientBean getClientDetails(int clientId);
	public boolean delete(int clientId);
	public boolean add(ClientBean bean);
	public boolean modify(int clientId);
	public boolean clientLogin(String ClientName,String password);
	

}
