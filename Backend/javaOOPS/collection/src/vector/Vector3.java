package vector;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v3=new Vector();
		v3.addElement(20);
		v3.addElement(40);
		v3.addElement(60);
		v3.addElement(80);
		v3.add(100);
		System.out.println(v3);
		v3.removeElement(new Integer(60));
		v3.removeElementAt(1);
		System.out.println(v3);
		
		Object o1[]=new Object[v3.size()];
		
		v3.copyInto(o1);
		for(int i=0;i<o1.length;i++) {
			System.out.println(o1[i]);
		}
		v3.removeAllElements();
		System.out.println(v3);
		
		
		
		Vector v4=new Vector();
		v4.add(16);
		v4.add(32);
		System.out.println(v4.size());
		System.out.println(v4.capacity());
		v4.trimToSize();
		System.out.println(v4.size());
		System.out.println(v4.capacity());
		v4.ensureCapacity(8);
		v4.setSize(9);
		System.out.println(v4.size());
		System.out.println(v4.capacity());
		System.out.println(v4);

	}

}
