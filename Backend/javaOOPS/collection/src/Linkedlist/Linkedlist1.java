package Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(24);
		l1.add(26);
		l1.add(36);
		l1.add(null);
		System.out.println("----listiterator-----");
		ListIterator l2=l1.listIterator();
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
		l1.add(12);
		System.out.println(l1);
		l1.remove(new Integer(12));
		System.out.println(l1);
		
		System.out.println("-----foreach-------");
		for(Object i1:l1) {
			System.out.println(i1);
		}
		System.out.println("-------for loop----");
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		

	}

}
