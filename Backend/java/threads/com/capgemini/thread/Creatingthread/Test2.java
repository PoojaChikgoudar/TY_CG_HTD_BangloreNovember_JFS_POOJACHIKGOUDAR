package com.capgemini.thread.Creatingthread;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started..");
		Thread2 t2=new Thread2();
		Thread t1=new Thread(t2);
		t1.start();
		System.out.println("main ended...");

	}

}
