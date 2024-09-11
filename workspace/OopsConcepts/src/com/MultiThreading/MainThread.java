package com.MultiThreading;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Main Thread start");
		Runnable obj = new ChildThread();
		
		Thread t = new Thread(obj);
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

}
