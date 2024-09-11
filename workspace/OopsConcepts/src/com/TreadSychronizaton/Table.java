package com.TreadSychronizaton;

public class Table {

	// 1.Method synchronization
//	public synchronized void printTable(int n) {
	public static synchronized void printTable(int n) {
		
		// 2.Synchronized Block
//		synchronized(this) {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
					System.out.println(n+"*"+i+"="+(n*i));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//		}
		
	}
}
