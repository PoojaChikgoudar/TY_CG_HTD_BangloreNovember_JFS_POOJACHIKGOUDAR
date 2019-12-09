package throwkey;

public class Ola {
	Googlemap g1;

	public Ola(Googlemap g1) {
		super();
		this.g1 = g1;
	}
	void find(String s1) {
		try {
    g1.findlocation(s1);
}
		catch(NullPointerException ne) {
			System.out.println("ola user plz enter the loaction...");
		}
	}
}
