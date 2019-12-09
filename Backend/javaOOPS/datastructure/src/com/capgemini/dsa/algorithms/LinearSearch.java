package com.capgemini.dsa.algorithms;

public class LinearSearch {
	public void lsearch(int a[],int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=ele) {
				System.out.println("element not found");
			}
			else {
				System.out.println("element  found");
			}
		}
	}
	

}
