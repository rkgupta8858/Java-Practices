package com.rahul.setexample;

import java.util.HashSet;

class Test{
	public Test() {
		System.out.println("Rohit");
	}
	public Test(String name) {
		this();
		System.out.println(name);
	}

}


public class HashSetExample extends Test {
	public HashSetExample() {
		super("Rahul Gupta");
		System.out.println("Rahul kUmar");
		
	}
	

	public static void main(String[] args) {
		HashSetExample hs = new HashSetExample();
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Rahul");
		hashSet.add("Rohit");
		hashSet.add("Ravi");
		hashSet.add("Rahul");
		hashSet.add("Amit");
		hashSet.add("Bittu");
		hashSet.add("Raman");
		
		
		System.out.println(hashSet);
		System.out.println(hashSet.hashCode());
		System.out.println(hashSet.size());
		hashSet.clear();
		System.out.println(hashSet);
		
		

	}

}
