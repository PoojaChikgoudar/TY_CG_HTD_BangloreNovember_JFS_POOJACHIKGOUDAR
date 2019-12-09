package staticAndNonstatic;

public class Employee {
	String name;
	int age;
	double salary;
	Employee(String n,int a,double sal){
		name=n;
		age=a;
		salary=sal;
		
	}
	void details() {
		System.out.println("name is "+name+" age is "+age+" salary is "+salary);
		
	}

}
