package com.FunctionalInterface;

import java.util.Comparator;

public class NameSorting implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		if(b1.name.length() == b2.name.length())
			return 1;
		else if(b1.name.length() > b2.name.length())
			return 0;
		else 
			return -1;
	}

}
