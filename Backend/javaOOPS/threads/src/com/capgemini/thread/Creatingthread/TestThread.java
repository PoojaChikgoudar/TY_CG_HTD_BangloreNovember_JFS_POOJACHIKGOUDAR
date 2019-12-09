package com.capgemini.thread.Creatingthread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started..");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("main ended...");

	}

}
