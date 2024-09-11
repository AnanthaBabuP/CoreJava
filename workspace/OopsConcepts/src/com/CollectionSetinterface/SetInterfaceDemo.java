package com.CollectionSetinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// Set - Interface
		// HashSet
		// LinkedHashSet
		// TreeSet
		
		HashSet s1 = new HashSet(); // Random Order based on hasCode method()
		
		s1.add("java");
		s1.add("python");
		s1.add("php");
		s1.add("c language");
		s1.add("android");
		s1.add("java");
		
		System.out.println(s1);
		
		// LinkedHashset
		LinkedHashSet s2 = new LinkedHashSet(); // User input order
		
		s2.add("java");
		s2.add("python");
		s2.add("php");
		s2.add("c language");
		s2.add("android");
		s2.add("java");
	
		System.out.println(s2);
		
		// TreeSet
		TreeSet s3 = new TreeSet(); // Natural (or) Assigning Order
		
		s3.add("java");
		s3.add("python");
		s3.add("php");
		s3.add("c language");
		s3.add("android");
		s3.add("java");
	
		System.out.println(s3);
	}

}
