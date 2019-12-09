package com.capgemini.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
  h1.put(34,new Student(22,"Pooja"));
  h1.put(64,new Student(24,"megha"));
  h1.put(null,new Student(29,"Poo"));
  
        Collection<Student> c1=h1.values();
        for(Student s1:c1) {
        	System.out.println(s1);
        }
        System.out.println(h1.containsKey(64));
        System.out.println(h1.containsValue(new Student(22,"Pooja")));
        
        Set<Integer> i2=h1.keySet();
        for(Integer i3:i2) {
        	System.out.println(i2);
        	
        }
        System.out.println(h1.size());
        System.out.println(h1.isEmpty());
	}

}
