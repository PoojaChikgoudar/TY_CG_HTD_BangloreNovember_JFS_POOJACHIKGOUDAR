
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="John";
		System.out.println("s1 value "+s1.hashCode());
		String s2=new String("Pooja");
		s1="Megha";
		System.out.println("s1 value "+s1.hashCode());
		String s3="John";
		System.out.println("s3 value "+s3.hashCode());

	}

}
