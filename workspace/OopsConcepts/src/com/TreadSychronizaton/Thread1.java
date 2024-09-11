package com.TreadSychronizaton;

public class Thread1 extends Thread{

	Table t1;
	public Thread1(Table t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		t1.printTable(2);
	}
}
