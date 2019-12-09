package throwkey;

public class Googlemap {
	
	void findlocation(String a) {
		try {
		System.out.println(a.length());
		
	}
		catch(NullPointerException ne) {
			System.out.println("enter the location");
			throw ne;
		}
	}

}
