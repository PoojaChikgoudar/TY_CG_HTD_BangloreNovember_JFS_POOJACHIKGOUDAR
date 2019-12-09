package com.capgemini.map.treeset;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAge a1=new StudentAge();
		StudentName a2=new StudentName();
		TreeMap<Student,String> t1=new TreeMap<Student,String>(a2);
		t1.put(new Student(6,"Pooja"),"1 st std");
		t1.put(new Student(18,"Anu"),"12th std");
		t1.put(new Student(12,"Megha"),"6th std");
		
		Set<Map.Entry<Student,String>> s1=t1.entrySet();
		for(Map.Entry<Student,String> s2:s1) {
			System.out.println(s2.getKey());
			System.out.println(s2.getValue());
		}

		
	System.out.println(t1.get(new Student(18,"Anu")));
	}

}
