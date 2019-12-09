package com.capgemini.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(1, "Pooja");
		h1.put(9, "Megha");
		h1.put(2, "Poo");
		h1.put(10, "Ashu");
		h1.put(50,"Anu");
	Set<Map.Entry<Integer,String>> s1=h1.entrySet();
	for(Map.Entry<Integer,String> a2:s1) {
		System.out.println(a2.getKey());
		System.out.println(a2.getValue());
		System.out.println("-------------");
	}

	}

}
