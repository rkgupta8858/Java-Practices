package com.rahul.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		int i = 1;
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Mango");
		treeSet.add("Banana");
		treeSet.add("Litchi");
		treeSet.add("Papaya");
		treeSet.add("Mango");
		
		System.out.println(treeSet);
		
		Iterator<String> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(i +"-"+itr.next());
			i++;
		}

	}

}
