import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> t2=new TreeSet<Student>();
		t2.add(new Student(22,"Pooja"));
		t2.add(new Student(23,"Megha"));
		t2.add(new Student(22,"Pooja"));

		Iterator i1=t2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
