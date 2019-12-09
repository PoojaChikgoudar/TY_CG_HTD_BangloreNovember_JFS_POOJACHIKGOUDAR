package com.capgemini.queue.priorityqueue;

import java.util.ArrayDeque;

public class ArrayDequeue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque q1=new ArrayDeque();
		q1.add(24);
		q1.add(36);
		q1.add(12);
		q1.addFirst(99);
		q1.add(36);
		q1.add(2);
		q1.add(null);
		System.out.println(q1);
		for(Object o1:q1) {
			System.out.println(o1);
		}
		

	}

}
