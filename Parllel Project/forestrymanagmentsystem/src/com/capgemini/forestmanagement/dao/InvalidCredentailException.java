package com.capgemini.forestmanagement.dao;

public class InvalidCredentailException extends Exception {
	String msg;

	public InvalidCredentailException(String msg) {
		super();
		this.msg = msg;
	}
	

}
