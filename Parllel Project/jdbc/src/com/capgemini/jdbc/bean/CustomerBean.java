package com.capgemini.jdbc.bean;

public class CustomerBean {
	private int customerId;
	private String customerName;
	private String streetAdress1;
	private String streetAdress2;
	private String town;
	private int postalCode;
	private String email;
	private long telephoneNumber;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getStreetAdress1() {
		return streetAdress1;
	}
	public void setStreetAdress1(String streetAdress1) {
		this.streetAdress1 = streetAdress1;
	}
	public String getStreetAdress2() {
		return streetAdress2;
	}
	public void setStreetAdress2(String streetAdress2) {
		this.streetAdress2 = streetAdress2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	@Override
	public String toString() {
		return "CustomerBean [customer_id=" + customerId + ", customer_name=" + customerName + ", streetadress1="
				+ streetAdress1 + ", streetadress2=" + streetAdress2 + ", town=" + town + ", postalcode=" + postalCode
				+ ", email=" + email + ", telephonenumber=" + telephoneNumber + "]";
	}
	
	

}
