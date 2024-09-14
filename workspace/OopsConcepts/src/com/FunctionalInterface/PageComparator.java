package com.FunctionalInterface;

import java.util.Comparator;

public class PageComparator implements Comparator<Book>{

	@Override
	public int compare(Book x1, Book x2) {
		if(x1.page == x2.page)
			return 1;
		else if(x1.page > x2.page)
			return 0;
		else
			return -1;
	}

}
