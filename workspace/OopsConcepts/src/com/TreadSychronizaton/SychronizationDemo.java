package com.TreadSychronizaton;

public class SychronizationDemo {

	public static void main(String[] args) {
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		t1.start();
		
		Tread2 t2 = new Tread2(t);
		t2.start();

	}

}
