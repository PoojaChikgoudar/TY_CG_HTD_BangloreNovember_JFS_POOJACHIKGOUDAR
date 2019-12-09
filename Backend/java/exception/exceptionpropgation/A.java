package exceptionpropgation;

public class A {
	static void o(){
		try {
		B.n();
		
	}catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
		throw ae;
	}
	}
}
