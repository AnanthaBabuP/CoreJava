package com.MultiThreading.MainMultithreading;

public class MainThreadDemo implements Runnable{
	Thread t;
	String threadName;
	
	MainThreadDemo(String name, int priority){
		threadName = name;
		t= new Thread(threadName);
//		t.start();
		t.setName(threadName);
		t.setPriority(priority);
	
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() +"Start");
		System.out.println(Thread.currentThread().getName()+" priority "+t.getPriority());
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +" = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread"+ Thread.currentThread().getName() + "is End");
		
	}

}
