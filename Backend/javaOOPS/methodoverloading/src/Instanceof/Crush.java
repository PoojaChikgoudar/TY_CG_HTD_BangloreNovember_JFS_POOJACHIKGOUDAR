package Instanceof;

public class Crush {
	void recieve(Phone p) {
		if(p instanceof BasicSet) {
			System.out.println("Tnanks");
		}
		else if(p instanceof Oppo) {
			System.out.println("Tnank you");
		}
		else if(p instanceof OnePlus) {
			System.out.println("Tnank you so much dear");
		}
		else if(p instanceof Apple) {
			System.out.println("Love you");
		}
		else {
			System.out.println("Idiot");
		}
	}

}
