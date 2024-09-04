package com.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*
		 	StringBuffer sbf = new StringBuffer("java");
			System.out.println(sbf); // java
			sbf.append(" developer"); // java developer
			System.out.println(sbf); // java developer - changes changed
			// VS STRING
			String s= new String("java");
			System.out.println(s); // java
			s.concat(" developer"); // java developer
			System.out.println(s); // java - Changes not change
		*/
		
		StringBuffer sbf = new StringBuffer("Java is a Programming");
		System.out.println(sbf);
		
		// append method -> same like String concat Method
		sbf.append(" Language");
		System.out.println(sbf);
		
		// insert method
		sbf.insert(9, " Object Oriented");
		System.out.println(sbf);
		
		// replace method
		sbf.replace(26, 37,  "Secure");
		System.out.println(sbf);
		
		// delete method
		sbf.delete(26, 33);
		System.out.println(sbf);
		
		// CharAt method
		System.out.println(sbf.charAt(2));
		
		// length method
		System.out.println(sbf.length());
		
		// subString method
		System.out.println(sbf.substring(10));
		System.out.println(sbf.substring(10, 16));
		
		// reverse method
		sbf.reverse();
		System.out.println(sbf);
		
		
	}
}
