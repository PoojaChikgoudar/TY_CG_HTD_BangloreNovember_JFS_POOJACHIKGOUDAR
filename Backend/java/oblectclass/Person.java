
public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize method is called");
		super.finalize();
	}
	
	

}
