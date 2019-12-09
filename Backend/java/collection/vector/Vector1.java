package vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add(12);
		v1.add(24);
		v1.add(36);
		v1.add(48);
		System.out.println(v1);
		v1.remove(new Integer(36));
		System.out.println(v1);
		v1.set(0, 1);
		System.out.println(v1);
		
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}

	}

}
