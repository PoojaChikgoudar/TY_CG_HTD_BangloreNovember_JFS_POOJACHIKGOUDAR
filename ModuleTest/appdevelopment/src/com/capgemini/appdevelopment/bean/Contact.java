package com.capgemini.appdevelopment.bean;

public class Contact {
	private String name;
	private long number;
	private String group1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGroup1() {
		return group1;
	}
	public void setGroup1(String group1) {
		this.group1 = group1;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", group1=" + group1 + "]";
	}
	

}
