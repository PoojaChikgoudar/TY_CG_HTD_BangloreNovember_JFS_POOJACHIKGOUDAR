package com.capgemini.forestmanagement.dao;





public class AdminDAOImpl implements AdminDAO  {

	@Override
	public boolean adminLogin(String userName, String password) throws InvalidCredentailException {
		String user="Pooja";
		String pass="poo123";
		
		if(userName.equals(user)) {
			if(password.equals(pass)) {
				System.out.println("Login sucessfull...");
				return true;
			}
		}
		
		
		System.out.println("Wrong username and password");
		return false;
	}
	
	}

