
public class TestPerson {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		Person p1=new Person("Pooja");
		//p1.finalize();
		p1=null;
		
		System.gc();
		System.out.println("Main ended");

	}

}
