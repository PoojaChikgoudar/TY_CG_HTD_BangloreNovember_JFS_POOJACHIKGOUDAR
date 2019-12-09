package finallyblock;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started...");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("dont deal with zro...");
		}
		finally {
			System.out.println("finally block is called...");
		}
		System.out.println("main ended...");

	}

}
