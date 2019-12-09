import java.util.ArrayList;
import java.util.Collection;

public class MethodsodCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----add all---");
		Collection c=new ArrayList();
		c.add(12);
		c.add(23);
		c.add(25);
		 
		Collection c1=new ArrayList();
		c1.add(24);
		c1.add(25);
		c1.add(26);
		c.remove(24);
		c.addAll(c1);
		System.out.println(c);
		
		System.out.println("----remove all---");
		Collection c3=new ArrayList();
		c3.add(12);
		c3.add(23);
		c3.add(25);
		 
		Collection c4=new ArrayList();
		c4.add(24);
		c4.add(25);
		c4.add(26);
		c3.addAll(c4);
		System.out.println(c3);
		c3.removeAll(c4);
		System.out.println(c3);
		
		System.out.println("----retain all---");
		Collection c5=new ArrayList();
		c5.add(12);
		c5.add(23);
		c5.add(25);
		 
		Collection c6=new ArrayList();
		c6.add(24);
		c6.add(25);
		c6.add(26);
		c5.addAll(c6);
		System.out.println(c5);
		c5.retainAll(c6);
		System.out.println(c5);
		
		System.out.println("----contains all----");
		Collection c7=new ArrayList();
		c7.add(12);
		c7.add(23);
		c7.add(25);
		System.out.println(c7);
		 
		Collection c8=new ArrayList();
		c8.add(24);
		c8.add(25);
		c8.add(26);
		System.out.println(c8);
		System.out.println(c7.containsAll(c8));
		
		
		System.out.println("---clear--");
		System.out.println(c8);
		c8.clear();
		System.out.println(c8);
		
		
		System.out.println("---toArray---");
		Collection c9=new ArrayList();
		c9.add(12);
		c9.add(24);
		Object a[]=c9.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	 
		
		
		
		

	}

}
