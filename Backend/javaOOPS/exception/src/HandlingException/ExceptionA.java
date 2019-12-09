package HandlingException;

public class ExceptionA {
	void Exception(int a,String b) {
		try {
		System.out.println(500/a);
		System.out.println(b.length());
		
	}
		catch(ArithmeticException a1) {
			System.out.println("dont deal with zero..");
		}
		catch(NullPointerException ne) {
			System.out.println("dont deal with null..");
		}

}
}
