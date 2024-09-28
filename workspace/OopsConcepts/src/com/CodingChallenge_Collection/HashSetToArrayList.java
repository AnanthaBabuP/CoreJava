package com.CodingChallenge_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetToArrayList {

	public static void main(String[] args) {
		// Get Input From User using Scanner Class
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number of Elements : ");
		int elementCount = scan.nextInt();
		
		// Create a new HashSet
		HashSet<String> hasSet = new HashSet<>();
		
		//Get Elements From User And  add HashSet
		System.out.println("Enter the Elements One By One...");
		for(int i=0;i<elementCount;i++) {
			hasSet.add(scan.next());
		}
		
		// Print HashSet List
		System.out.println("HashSet Elements ...");
		for(String element : hasSet)
			System.out.println(element);
		
		// Change to HashSet to ArrayList
		ArrayList<String> aryList = new ArrayList<>(hasSet);
		
		// Print ArrayList List
		System.out.println("ArrayList Elements ...");
		for(String element : aryList)
			System.out.println(element);
		
		scan.close();
	}

}
