package com.shareScreenCode;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		
		// Get Input From User Using Scanner Class
		Scanner scan = new Scanner(System.in);
		
		// Get 1st Number From User
		System.out.println("Enter The 1st Number ...");
		int num1 = scan.nextInt();
		
		// Get 2nd Number From User
		System.out.println("Enter The 2st Number ...");
		int num2 = scan.nextInt();
		
		// Get Process From User
		System.out.println("Process ... add sub mul div ");
		String process = scan.next();
		
		// Check Process From User Input
		switch (process) {
		case "add":
			System.out.println(add(num1,num2));
			break;
			
		case "sub":
			System.out.println(sub(num1,num2));
			break;
			
		case "mul":
			System.out.println(mul(num1,num2));
			break;
			
		case "div":
			System.out.println(div(num1,num2));
			break;

		default:
			System.out.println("Invalid Process");
			break;
		}
		
		scan.close();

	}
	
	/*
	 * Addition Process
	 */
	public static int add(int a, int b) {
		return a+b;
	}
	
	/*
	 * Subtraction Process
	 */
	public static int sub(int a, int b) {
		return a-b;
	}
	
	/*
	 * Multiplication Process
	 */
	public static int mul(int a, int b) {
		return a*b;
	}
	
	/*
	 * Division Process
	 */
	public static int div(int a, int b) {
		return a/b;
	}

}
