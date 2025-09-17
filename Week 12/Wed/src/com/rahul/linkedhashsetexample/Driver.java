package com.rahul.linkedhashsetexample;

import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Rahul");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Ravi");
		linkedHashSet.add("Rohan");
		linkedHashSet.add("Aryan");
		linkedHashSet.add("Anand");
		System.out.println(linkedHashSet);
		System.out.println(linkedHashSet.size());
	}

}
