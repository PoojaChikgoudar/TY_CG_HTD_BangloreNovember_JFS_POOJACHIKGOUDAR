import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IterationsinArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(35);
		a1.add(38);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		
		System.out.println("-----For loop-------");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("----foreach loop-----");
		for(Integer i1:a1) {
			System.out.println(i1);
		}
		
		System.out.println("------Iterator method-----");
		Iterator i1=a1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("----ListIterator method in backward----");
		
		ListIterator<Integer> i2=a1.listIterator(a1.size());
		
	     while(i2.hasPrevious()) {
	    	 System.out.println(i2.previous());
	     }
	     
	     System.out.println("----ListIterator method in forward----");
			
			ListIterator<Integer> i3=a1.listIterator();
			
		     while(i3.hasNext()) {
		    	 System.out.println(i3.next());
		     }
		     while(i3.hasPrevious()) {
		    	 System.out.println(i3.previous());
		     }
		     
		     ArrayList<Integer> a2=new ArrayList<Integer>();
		     a2.add(12);
		     a2.add(24);
		     System.out.println(a2);
		     a2.remove(new Integer(24));
		     System.out.println(a2);
		     
	}

}
