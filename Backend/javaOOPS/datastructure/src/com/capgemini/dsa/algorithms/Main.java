package com.capgemini.dsa.algorithms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a1=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		LinearSearch l1=new LinearSearch();
		System.out.println("enter the element to search");
		int ele=sc.nextInt();
		l1.lsearch(a1, ele);

	}

}