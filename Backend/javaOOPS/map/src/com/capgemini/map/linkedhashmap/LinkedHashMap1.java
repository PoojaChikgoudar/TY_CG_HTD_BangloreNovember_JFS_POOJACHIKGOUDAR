package com.capgemini.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		l1.put("BTR", 56001);
		l1.put("BTM", 56002);
		l1.put("Rajajinagar", 560111);
		l1.remove("Rjajinagar");
		Set<Map.Entry<String, Integer>> s1=l1.entrySet();
		for(Map.Entry<String, Integer> m1:s1) {
			System.out.println(m1);
		}
		Set<String> s2=l1.keySet();
		for(String s3:s2) {
			System.out.println(s3);
		}
        System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey("BTM"));
		System.out.println(l1.containsValue(56002));
	}

}
