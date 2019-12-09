package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.add(new Student(22,"Pooja"));
		p1.add(new Student(21,"Megha"));
		p1.add(new Student(20,"Shashank"));
		p1.add(new Student(22,"Pooja"));
		
		for(Student s1:p1) {
			System.out.println(s1);
		}

	}

}
