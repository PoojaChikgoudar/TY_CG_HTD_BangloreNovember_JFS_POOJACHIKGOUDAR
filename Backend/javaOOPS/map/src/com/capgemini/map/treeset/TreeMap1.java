package com.capgemini.map.treeset;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
      t1.put(22,"pooja");
      t1.put(23,"poo");
      t1.put(24,"megha");
      t1.get(24);
      Set<Map.Entry<Integer,String>> s1=t1.entrySet();
      for(Map.Entry<Integer, String>m1:s1) {
    	  System.out.println(m1.getValue());
    	  System.out.println(m1.getKey());
      }
      System.out.println(t1.size());
      System.out.println(t1.isEmpty());
      System.out.println(t1.containsKey(22));
      System.out.println(t1.containsValue("poo"));
      
      
      
	}

}
