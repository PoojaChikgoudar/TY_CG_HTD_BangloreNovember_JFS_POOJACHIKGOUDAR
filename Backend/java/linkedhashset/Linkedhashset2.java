import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset2 {

	public static void main(String[] args) {
        LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		l1.add(12);
		l1.add(122);
		l1.add(24);
		l1.add(29);
		l1.add(null);
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}



	}





}
