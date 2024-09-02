package com.ComparableInterface;

import java.util.Arrays;

public class ComparableInterface implements Comparable {

	public static void main(String[] args) {
		//String[] str = {"java","andriod","php","sql","c"};
		Books[] myBook = {
				new Books("java",458),
				new Books("android",250),
				new Books("php",360),
				new Books("sql",240),
				new Books("c",150)
		};
		Arrays.sort(myBook);
		
		for(Books s : myBook)
			System.out.println(s);

	}

	public int compareTo(Object x) {
		String x1 = (String)x;
		return x1.compareTo((String)x);
	}

}
