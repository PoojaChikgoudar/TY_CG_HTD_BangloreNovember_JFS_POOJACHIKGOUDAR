package com.capgemini.forestmanagement.dao;



public interface AdminDAO {
	public boolean adminLogin(String userName,String password) throws InvalidCredentailException;

}
