package staticAndNonstatic;

public class TestPerson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1();
		p1.age=22;
		p1.name="Pooja";
		p1.details();
		Person1 p2=new Person1();
		p2.intialise(21, "Megha");
		p2.details();

		
	}

}
