
public class Calci {
	void divide(int a,int b) {
		System.out.println("divide method started...");
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
		System.out.println("method ended");
	}

}
