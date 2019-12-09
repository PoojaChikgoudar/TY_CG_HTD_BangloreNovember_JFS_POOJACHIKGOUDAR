package com.capg.Acess.pkg2;
import com.capg.Acess.pkg1.Student;

public class Teststudent extends Student{

	protected Teststudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	void stddetails() {
		System.out.println("name is "+name);
	}
	public static void main(String args[]) {
	
	 Teststudent t1=new Teststudent("Megha");
	 
	 t1.details(); 
	}
	 

}
