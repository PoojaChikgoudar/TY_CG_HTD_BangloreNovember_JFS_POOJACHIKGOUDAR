import java.util.Collection;
import java.util.ArrayList;

public class MethodsofCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ading element to collection
		Collection c1=new ArrayList();
		c1.add(12);
		System.out.println(c1);
		
		//removing element from collection
		c1.remove(12);
		System.out.println(c1);
		
		//finding size of the collection
		System.out.println(c1.size());
		
		//checking the collection is empty or not
		System.out.println(c1.isEmpty());
		c1.add(12);
		System.out.println(c1.contains(12));

	}

}
