package com.capgemini.thread.Creatingthread;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		System.out.println("--------Predicate-------");
		Predicate<Integer> p=i->i%2==0;
		boolean b=p.test(12);
		System.out.println(b);
		boolean b1=p.test(25);
		System.out.println(b1);
		System.out.println("-----Function----");
		Function<Integer,Integer> f1=i1->i1*100;
		int a=f1.apply(86);
		System.out.println(a);
		
	}

}
