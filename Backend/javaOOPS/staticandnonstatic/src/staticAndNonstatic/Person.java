package staticAndNonstatic;

public class Person {
	static int age;
	String name;
	void personDetails(){
		System.out.println("name is " +name+ " and age is "+age);
		personDetailsstatic();
		
		
		
	}
	static void personDetailsstatic(){
		System.out.println("age is "+age);
		
	}


}
