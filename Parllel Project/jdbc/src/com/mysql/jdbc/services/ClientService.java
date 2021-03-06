package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.ClientBean;

public interface ClientService {
	public List<ClientBean> getAllClients();
	public boolean add(ClientBean bean);
    public boolean modify(int clientId,ClientBean bean);
	public boolean delete(int clientId);
	public ClientBean clientLogin(String clientName,String password);

}
