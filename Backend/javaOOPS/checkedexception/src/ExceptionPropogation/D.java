package ExceptionPropogation;

public class D {
	static void o() throws ClassNotFoundException {
		Class.forName("ExceptionPropogation.A");
	}

}
