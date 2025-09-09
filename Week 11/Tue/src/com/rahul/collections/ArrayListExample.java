package com.rahul.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("Rahul");
		al.add(50000.0);
		al.add(50000.0);
		al.add("a");
		al.add("Gupta");
		
		System.out.println(al);
		al.add(2, "Kumar");
		System.out.println(al);
		System.out.println(al.size());

	}

}
