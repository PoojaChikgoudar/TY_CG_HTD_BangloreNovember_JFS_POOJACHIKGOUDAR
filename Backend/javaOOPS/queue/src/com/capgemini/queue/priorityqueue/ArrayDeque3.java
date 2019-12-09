package com.capgemini.queue.priorityqueue;

import java.util.ArrayDeque;

public class ArrayDeque3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> q1=new ArrayDeque<String>();
		q1.add("pooja");
		q1.addFirst("Ashu");
		q1.addLast("nanda");
		q1.add("abhi");
		q1.add("anu");
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		q1.removeFirst();
		

	}

}
