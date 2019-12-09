import java.util.ArrayList;
import java.util.Collection;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add("Pooja");
		System.out.println(c1);
		c1.remove("Pooja");
		System.out.println(c1);
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		c1.add("Pooja");
		System.out.println(c1.contains("Pooja"));


	}

}
