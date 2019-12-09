package com.capgemini.thread.Creatingthread;

public class User1 extends Thread{
	IRCTC i1;
	public User1(IRCTC i1) {
		this.i1 = i1;
	}
	public void run() {
		i1.confirmTicket();

	}



}
