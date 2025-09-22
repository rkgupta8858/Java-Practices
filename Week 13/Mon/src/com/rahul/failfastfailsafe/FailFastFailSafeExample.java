package com.rahul.failfastfailsafe;

import java.util.HashSet;
import java.util.Iterator;

public class FailFastFailSafeExample {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(101);
		hashSet.add(500);
		hashSet.add(5);
		hashSet.add(12);
		hashSet.add(564);
		System.out.println(hashSet);
		
		Iterator<Integer> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			hashSet.add(656);
		}
	}

}
