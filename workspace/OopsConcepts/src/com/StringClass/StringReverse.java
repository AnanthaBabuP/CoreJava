package com.StringClass;

public class StringReverse {

	public static void main(String[] args) {
		// String is a immutable class. no reverse method is here
		
		String s1 = "java";
		String result = reverse(s1);
		
		System.out.println("Before Reverse String is : "+ s1);
		System.out.println("After Reverse String is :"+result);

	}

	public static String reverse(String s1) {
		String reverse ="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse = reverse + s1.charAt(i);
		}
		
		return reverse;
		
	}

}
