package com.capgemini.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(22,new Employee(20000,"pooja"));
		l1.put(24,new Employee(40000,"poo"));
		l1.put(26,new Employee(60000,"megha"));
		System.out.println(l1.get(22));
		Set<Map.Entry<Integer, Employee>> s1=l1.entrySet();
		for(Map.Entry<Integer, Employee> m1:s1) {
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
		
		Set<Integer> s2=l1.keySet();
		for(Integer i3:s2) {
			System.out.println(i3);
		}
		System.out.println(l1.containsKey(22));
		System.out.println(l1.containsValue(new Employee(60000,"megha")));
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		
	}

}
