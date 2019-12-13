package com.capgemini.appdevelopment.service;

import java.util.List;

import com.capgemini.appdevelopment.bean.Contact;

public interface ContactService {
	public  List<Contact> getAllContact();
	public boolean insert(Contact contact);
	public boolean delete(String name);
	public boolean update(String name,Contact contact);
	


}
