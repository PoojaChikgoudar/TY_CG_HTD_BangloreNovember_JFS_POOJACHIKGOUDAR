package throwkey;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started....");
		Googlemap g1=new Googlemap();
		Ola o1=new Ola(g1);
		o1.find(null);
		System.out.println("main ended...");

	}

}
