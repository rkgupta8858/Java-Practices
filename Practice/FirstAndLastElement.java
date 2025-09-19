package com.rahul.treeset;

import java.util.TreeSet;

public class FirstAndLastElement {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(5);
		treeSet.add(15);
		treeSet.add(6);
		treeSet.add(2);
		System.out.println(treeSet);
		
		System.out.println("First Element : "+treeSet.getFirst());
		System.out.println("Last  Element : "+treeSet.getLast());

	}

}
