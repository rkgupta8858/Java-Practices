package com.rahul.treeset;

import java.util.TreeSet;

public class SubSetOfElement {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(72);
		treeSet.add(71);
		treeSet.add(45);
		treeSet.add(35);
		treeSet.add(89);
		treeSet.add(2);
		treeSet.add(80);
		
		System.out.println(treeSet);
		System.out.println(treeSet.subSet(45, 80));
		
		System.out.println("Less than 50 : "+treeSet.headSet(50));
		System.out.println("Greater than 50 : "+treeSet.tailSet(50));
		

	}

}
