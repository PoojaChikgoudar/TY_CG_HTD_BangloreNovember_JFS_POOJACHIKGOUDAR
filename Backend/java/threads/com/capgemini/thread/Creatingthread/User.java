package com.capgemini.thread.Creatingthread;

public class User extends Thread{
	PVR p1;
	public User(PVR p1) {
		super();
		this.p1 = p1;
	}
	public void run() {
		p1.confirmTicket();
		
	}

}
