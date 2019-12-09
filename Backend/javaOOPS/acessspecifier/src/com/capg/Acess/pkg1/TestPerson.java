package com.capg.Acess.pkg1;

public class TestPerson {
	public static void main(String args[]) {
		 Person p1=new Person("Pooja");
		 System.out.println(p1.name);
		 p1.details();
		 System.out.println(Person.age);
		 Person.stddetails();
	}

}
