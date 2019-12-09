package exceptionpropgation;

public class C {
	static void m() {
		try {
		System.out.println(10/0);
	}catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
	}
	}

}
