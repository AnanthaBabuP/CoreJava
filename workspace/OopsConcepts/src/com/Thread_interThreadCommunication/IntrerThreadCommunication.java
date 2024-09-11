package com.Thread_interThreadCommunication;

public class IntrerThreadCommunication {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		OddThread t1 = new OddThread(p);
		EvenThread t2 = new EvenThread(p);
		
		t1.start();
		t2.start();

	}

}
