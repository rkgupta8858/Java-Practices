package com.rahul.rk;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparatorInterfaceExample {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyComparator());
		set.add(10);
		set.add(5);
		set.add(85);
		set.add(1);
		set.add(25);
		set.add(32);
		System.out.println(set);
	}

}
