package com.ComparableInterface;

public class Books implements Comparable{
	
	String bookName;
	int pages;
	
	public Books(String bookName, int pages) {
		this.bookName = bookName;
		this.pages = pages;
	}

	public int compareTo(Object o) {
		Books b1 = (Books)o;
		//return this.bookName.length() - b1.bookName.length();
		return pages - b1.pages;
	}

	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", pages=" + pages + "]";
	}

	
}
