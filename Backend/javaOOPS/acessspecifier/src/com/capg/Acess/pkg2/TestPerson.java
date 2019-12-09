package com.capg.Acess.pkg2;
import com.capg.Acess.pkg1.Person;
import  static com.capg.Acess.pkg1.Person.*;

public class TestPerson {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("age is "+age);
		Person p1=new Person("Pooja");
		System.out.println(p1.name);
		p1.details();
		stddetails();

	}

}
