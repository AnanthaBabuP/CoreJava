package com.MultiThreading;

public class MainThread2 {

	public static void main(String[] args) {
		System.out.println("Main Thread start");
		
		Thread t = new ChildThread2();
		t.start();
		for (int i = 0;i<=5;i++) {
			System.out.println("main thread on :"+i);
			try {
				Thread.sleep(1000);// 1000 milli-second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Main thread introbted");
			} 
		}
		System.out.println("Main Thread end");
	}
	
	// context-switch
	
	// 3 thread
	// 1.Main thread - JRE/JVM
	// 2.Garbage collector -	 product void finalize()
	// 3. thread Scheduler -
}
