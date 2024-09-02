package com.ComparatorInterface;

import java.util.Comparator;

public class PriceComparator implements Comparator<Books> {

	public int compare(Books x, Books y) {
		if(x.price > y.price)
			return 1;
		else if (x.price == y.price)
			return 0;
		else
			return -1;
	}
}
