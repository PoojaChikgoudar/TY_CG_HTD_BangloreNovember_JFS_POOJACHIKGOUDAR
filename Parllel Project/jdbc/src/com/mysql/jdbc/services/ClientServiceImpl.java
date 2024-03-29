package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.ClientBean;

import com.capgemini.jdbc.dao.ClientDao;

import com.capgemini.jdbc.factory.ClientManager;

public class ClientServiceImpl implements ClientService {
	ClientDao dao=ClientManager.instanceOfClientDAOImpl();
	@Override
	public List<ClientBean> getAllClients() {
		// TODO Auto-generated method stub
		return dao.getAllClients();
	}

	@Override
	public boolean add(ClientBean bean) {
		// TODO Auto-generated method stub
		return dao.add(bean);
	}

	@Override
	public boolean modify(int clientId, ClientBean bean) {
		// TODO Auto-generated method stub
		return dao.modify(clientId, bean);
	}

	@Override
	public boolean delete(int clientId) {
		// TODO Auto-generated method stub
		return dao.delete(clientId);
	}

	@Override
	public ClientBean clientLogin(String clientName, String password) {
		// TODO Auto-generated method stub
		return dao.clientLogin(clientName, password);
	}

}
