package com.capgemini.jdbc.bean;

public class ClientBean {
	private int clientid;
	private String clientName;
	private String password;
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ClientBean [clientid=" + clientid + ", clientName=" + clientName + ", password=" + password + "]";
	}
	

}
