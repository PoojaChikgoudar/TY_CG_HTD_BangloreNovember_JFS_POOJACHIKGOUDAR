package com.capgemini.thread.Creatingthread;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
	}

}
