package com.CollectionListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.CollectionListInterface.ListInterfacce;

public class ListIterator_demo {

	public static void main(String[] args) {
		// Iterator
		// public boolean hasNext()
		// public Object next()
		// public void remove()
		
		
		// List-Iterator
		// public boolean hasNext()
		// public Object next()
		// public void remove()
		
		// public boolean hasPrevious()
		// public Object previous()
		
		// public void add()
		// public void set()
		
		// public int nextIndex()
		// public int priviousIndex()
		
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(25);
		a1.add(3);
		a1.add(56);
		a1.add(97);
		
		System.out.println(a1);
		
		ListIterator itr = a1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("_______________________________");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		itr.add(100); // add to 0's index
		itr.add(200); // add to 1's index
		
		System.out.println(a1);
		
		itr.next();
		itr.set(300); // replace to value
		
		System.out.println(a1);
		
		System.out.println(itr.nextIndex());
		System.out.println(itr.previousIndex());
	}
}
