package com.MultiThreading;

public class ChildThread  implements Runnable{

	public void run() {
		System.out.println("Child-thread starts");
		for(int i=0;i<=5;i++) {
			System.out.println("Child thread is:"+i);
			try {
				Thread.sleep(2000);// 1000 milli-second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Main thread introbted");
			} 
		}
		System.out.println("Child thread end");
	}
}
