package throwandthrows;

public class IRCTC {
	void confirmticket() throws ClassNotFoundException {
		try {
			Class.forName("throwandthrows.Paytm");
			System.out.println("ticket confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket not confirmed");
			throw e;
		}
	}

}
