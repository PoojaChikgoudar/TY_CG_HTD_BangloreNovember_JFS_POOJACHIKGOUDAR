package com.capgemini.map.treeset;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l1=new ArrayList<Employee>();
		l1.add(new Employee(22,"Pooja"));
		l1.add(new Employee(29,"Anu"));
		l1.add(new Employee(23,"Ashu"));
		
		
		
		
		TreeMap<String,ArrayList<Employee>> t1=new TreeMap<String,ArrayList<Employee>>();
		t1.put("Nanda",l1);
		t1.put("Abhi",l1);
		t1.put("Sachhi",l1);
		
		System.out.println(t1.get("Sachhi"));
		Set<Map.Entry<String,ArrayList<Employee>>> s1=t1.entrySet();
		for(Map.Entry<String,ArrayList<Employee>> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}

	}

}
