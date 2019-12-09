package com.capg.Acess.pkg1;

public class Person {
 public String name;
 public static int age=22;  
 public Person(String name) {
	 this.name=name;
 }
 public void details() {
	  System.out.println("name is " +name);
  }
  public static void stddetails() {
	  System.out.println("age is "+age);
  }
}
