package com.StringClass;

import java.util.Scanner;

public class Palindrome { // Reverse String is same as original String

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String for checking Palindrome...");
		String input = scan.next();
		
		String result = StringReverse.reverse(input);
		if(input.equals(result))
			System.out.println("Given String is palindrome");
		else
			System.out.println("Given String is not palindrome");
		scan.close();
	}

}
