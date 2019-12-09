import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset3 {

	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(22,"Pooja"));
		l1.add(new Employee(22,"Sachhi"));
		l1.add(new Employee(22,"Pooja"));
         Iterator i1=l1.iterator();
         while(i1.hasNext()){
        	 System.out.println(i1.next());
         }
         


	}

}
