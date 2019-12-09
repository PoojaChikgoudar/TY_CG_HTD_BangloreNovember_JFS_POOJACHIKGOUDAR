
public class TestB {
	
	void write() {
		String s1=null;
		try {
			System.out.println("length of String is "+s1.length());
		}
		catch(NullPointerException ne) {
			System.out.println("dont deal with null");
			//ne.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		TestB t1=new TestB();
		t1.write();
		System.out.println("main ended");

	}

}
