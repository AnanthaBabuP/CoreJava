package com.Thread_interThreadCommunication;

public class OddThread extends Thread{
	
	PrintNumber p;
	
	public OddThread(PrintNumber p) {
		this.p = p;
	}

	@Override
	public void run() {
		int minOdd = 1;
		
		while(minOdd<=10) {
			p.printOdd(minOdd);
			minOdd+=2;
		}
	}
}
