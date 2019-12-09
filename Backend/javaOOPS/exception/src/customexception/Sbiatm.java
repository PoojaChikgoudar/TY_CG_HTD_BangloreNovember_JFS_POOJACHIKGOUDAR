package customexception;

public class Sbiatm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started....");
		Atmsimulator a1=new Atmsimulator();
		try {
		a1.withdraw(41000);
		}
		catch(DaylimitException d) {
			System.out.println(d.getMessage());
		}
		
		System.out.println("main ended...");
	}

	

}
