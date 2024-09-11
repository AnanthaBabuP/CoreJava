package com.TreadSychronizaton;

public class Tread2 extends Thread{
	
	Table t1;
	
	public Tread2(Table t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.printTable(3);
	}
}
