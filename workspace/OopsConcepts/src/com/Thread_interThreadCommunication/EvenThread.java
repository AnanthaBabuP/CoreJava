package com.Thread_interThreadCommunication;

public class EvenThread extends Thread{
	PrintNumber p;
	
	
	
	public EvenThread(PrintNumber p) {
		this.p = p;
	}



	@Override
	public void run() {
		int minEven=2;
		while(minEven <= 10) {
			p.printEven(minEven);
			minEven+=2;
		}
		
	}
}
