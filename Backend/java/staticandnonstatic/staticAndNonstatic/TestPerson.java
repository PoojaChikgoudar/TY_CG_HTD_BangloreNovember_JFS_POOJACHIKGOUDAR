package staticAndNonstatic;

public class TestPerson {
	public static void main(String args[]) {
		Person p1=new Person();
		p1.name="Pooja";
		Person.age=22;
		p1.personDetails();
		
		
		
	}

}
