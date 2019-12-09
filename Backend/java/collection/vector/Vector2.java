package vector;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v2=new Vector();
		v2.add(23);
		v2.add(56);
		v2.add(78);
		v2.add(100);
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.setSize(10);
		System.out.println(v2.size());
		System.out.println(v2);
		v2.add(24);
		System.out.println(v2.size());
		System.out.println(v2);
		v2.set(5, 78);
		System.out.println(v2);
		

	}

}
