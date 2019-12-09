package Linkedlist;

import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(24);
		l1.add(34);
		l1.add(38);
		l1.add(44);
		l1.add(96);
		System.out.println(l1);
		System.out.println("---addfirst and adlast---");
		l1.addFirst(100);
		l1.addLast(99);
		System.out.println(l1);
		
		System.out.println("---removefirst and remove last---");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		l1.remove();
		System.out.println(l1);
		
		System.out.println("------removefirstandlastoccurence----");
		l1.add(34);
		l1.add(48);
		l1.removeFirstOccurrence(34);
		System.out.println(l1);
		l1.removeLastOccurrence(34);
		System.out.println(l1);
          
		
		System.out.println("-----getfirst and getlast----");
	
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		System.out.println("--------peekFirst and peeklast-----");
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		
		System.out.println("-----poll-------");
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println("----Offer--------");
		l1.add(28);
		l1.add(36);
		l1.add(96);
		l1.add(50);
		System.out.println(l1);
		l1.offer(100);
		System.out.println(l1);
		l1.offerFirst(200);
		System.out.println(l1);
		l1.offerLast(300);
		System.out.println(l1);
		System.out.println();
		
	}

}
