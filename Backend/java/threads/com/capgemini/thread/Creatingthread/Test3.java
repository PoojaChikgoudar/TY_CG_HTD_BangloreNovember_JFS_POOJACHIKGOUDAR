package com.capgemini.thread.Creatingthread;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started...");
		PVR p1=new PVR();
		User u1=new User(p1);
		u1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.leaveMe();
		System.out.println("main ended....");

	}

}
