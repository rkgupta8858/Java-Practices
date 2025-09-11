package com.rahul.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindMaximumMinimumUsingCollentions {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(201);
		al.add(45);
		al.add(65);
		al.add(25);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		System.out.println();
		
		int maxElement = Collections.max(al);
		int minElement = Collections.min(al);
		System.out.println("Maximum Element is : "+maxElement);
		System.out.println("Minimum Element is : "+minElement);

	}

}
