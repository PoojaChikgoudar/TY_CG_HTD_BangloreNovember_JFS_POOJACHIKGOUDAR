package com.capg.Acess.pkg1;

public class Student {
	protected String name;
	
	protected Student(String name) {
		this.name=name;
		
	}
	protected void details() {
		System.out.println("name is "+name);
	}

}
