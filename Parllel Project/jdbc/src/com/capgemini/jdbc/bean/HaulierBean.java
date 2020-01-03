package com.capgemini.jdbc.bean;

public class HaulierBean {
	private int haulier_id;
	private String haulier_name;
	private String adress;
	private String email;
	private long telephone;
	public int getHaulier_id() {
		return haulier_id;
	}
	public void setHaulier_id(int haulier_id) {
		this.haulier_id = haulier_id;
	}
	public String getHaulier_name() {
		return haulier_name;
	}
	public void setHaulier_name(String haulier_name) {
		this.haulier_name = haulier_name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "HaulierBean [haulier_id=" + haulier_id + ", haulier_name=" + haulier_name + ", adress=" + adress
				+ ", email=" + email + ", telephone=" + telephone + "]";
	}
	

}
