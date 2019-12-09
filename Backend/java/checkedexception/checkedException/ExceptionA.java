package checkedException;

public class ExceptionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started..");
		try {
			Class c1=Class.forName("checkedException.Person");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			
			System.out.println("classs not found");
		}
		System.out.println("main ended....");

	}

}
