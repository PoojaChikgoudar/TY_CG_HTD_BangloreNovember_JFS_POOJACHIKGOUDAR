package com.capgemini.appdevelopment.service;

import java.util.List;

import com.capgemini.appdevelopment.bean.Contact;
import com.capgemini.appdevelopment.dao.ContactDAO;
import com.capgemini.appdevelopment.factory.ContactDAOManager;

public class ContactServiceImpl implements ContactService {
	 ContactDAO dao=ContactDAOManager.instanceOfContactDAOImpl();

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return dao.getAllContact();
	}

	@Override
	public boolean insert(Contact contact) {
		
		return dao.insert(contact);
	}

	@Override
	public boolean delete(String name) {
		// TODO Auto-generated method stub
		return dao.delete(name);
	}

	@Override
	public boolean update(String name, Contact contact) {
		// TODO Auto-generated method stub
		return dao.update(name, contact);
	}

	

}
