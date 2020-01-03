package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.Client;

public interface ClientService {
	public List<Client> getAllClients();
	public boolean add(Client bean);
    public boolean modify(int clientId,Client bean);
	public boolean delete(int clientId);
	public Client clientLogin(String clientName,String password);


}
