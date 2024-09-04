package com.CustomException;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		System.out.println("Inside Main Method ...");
		m1();
	}

	static void m1() {
		System.out.println("Inside m1 Method...");
		try {
			int a;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Number ");
			a= s.nextInt();
			
			if(a<0) {
				throw new Exception("Nagative Number Not Allowed!!!");
			} else {
				System.out.println(a);
			}
			
		} catch (Exception e) {
			System.out.println("Inside Catch Block");
			System.out.println(e.getLocalizedMessage());
		}
	}
}
