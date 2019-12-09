
public class Testc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started...");
		int[] a1=new int[2];
		a1[0]=20;
		a1[1]=30;
		try {
		a1[2]=40;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("there is no size to store the data");
		}
		System.out.println("main ended...");

	}

}
