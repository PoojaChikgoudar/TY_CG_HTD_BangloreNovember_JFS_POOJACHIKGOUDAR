package com.capgemini.retailersmaintenanace.exception;

public class InvalidCredentailsException extends RuntimeException {
	
	String msg;
	
	public InvalidCredentailsException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	

}
