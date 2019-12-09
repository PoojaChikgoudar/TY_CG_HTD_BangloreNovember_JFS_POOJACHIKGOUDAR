import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Pooja");
		a1.add("Megha");
		a1.add("shashank");
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		
		System.out.println("--------For loop-----");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("----foreach loop-----");
		for(String i1:a1) {
			System.out.println(i1);
		}
		
		System.out.println("------Iterator method-----");
		Iterator i1=a1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("----ListIterator method in backward----");
		
		ListIterator<String> i2=a1.listIterator(a1.size());
		
	     while(i2.hasPrevious()) {
	    	 System.out.println(i2.previous());
	     }
	     
	     System.out.println("----ListIterator method in forward----");
			
			ListIterator<String> i3=a1.listIterator();
			
		     while(i3.hasNext()) {
		    	 System.out.println(i3.next());
		     }
		     while(i3.hasPrevious()) {
		    	 System.out.println(i3.previous());
		     }
		     
		     ArrayList<String> a2=new ArrayList<String>();
		     a2.add("Anu");
		     a2.add("Abhi");
		     System.out.println(a2);
		     a2.remove(new String("Anu"));
		     System.out.println(a2);
		     
		     
		     
		     
	     
	     


	}

}
