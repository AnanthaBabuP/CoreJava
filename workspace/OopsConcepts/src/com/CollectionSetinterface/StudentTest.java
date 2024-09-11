package com.CollectionSetinterface;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Arul",40,20);
		Student s2 = new Student("Raja", 43, 21);
		Student s3 = new Student("Arul", 40, 20);
		
		Set s = new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		System.out.println(s);

	}

}
