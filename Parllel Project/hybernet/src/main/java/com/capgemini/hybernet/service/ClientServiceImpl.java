package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.ClientDao;
import com.capgemini.hybernet.dto.Client;
import com.capgemini.hybernet.factory.ClientManager;

public class ClientServiceImpl implements ClientService{
	ClientDao dao=ClientManager.instanceOfClientDaoImpl();
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return dao.getAllClients();
	}

	public boolean add(Client bean) {
		// TODO Auto-generated method stub
		return dao.add(bean);
	}

	public boolean modify(int clientId, Client bean) {
		// TODO Auto-generated method stub
		return dao.modify(clientId, bean);
	}

	public boolean delete(int clientId) {
		// TODO Auto-generated method stub
		return dao.delete(clientId);
	}

	public Client clientLogin(String clientName, String password) {
		// TODO Auto-generated method stub
		return dao.clientLogin(clientName, password);
	}

}
