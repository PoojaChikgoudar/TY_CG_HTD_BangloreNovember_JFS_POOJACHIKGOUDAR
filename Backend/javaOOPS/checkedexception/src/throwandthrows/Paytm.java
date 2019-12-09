package throwandthrows;

public class Paytm {
	IRCTC i1;

	public Paytm(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	
	void bookticket() {
		try {
			i1.confirmticket();
			System.out.println("ticket confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("ticket not confirmed");
		}
	}

}
