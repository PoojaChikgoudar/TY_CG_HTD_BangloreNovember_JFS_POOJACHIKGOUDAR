package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new PriorityQueue();
		q1.offer(76);
		q1.offer(86);
		q1.offer(96);
		q1.offer(106);
		q1.offer(106);
        System.out.println(q1);
		q1.poll();
		q1.poll();
		q1.remove(96);
		q1.add(15);
		q1.add(20);
		q1.add(66);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.element());
		System.out.println(q1);
		for(Object o1:q1) {
			System.out.println(o1);
		}

	}

}
