package com.rahul.linkedlist;

import java.util.LinkedList;

public class StringReverse1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rahul");
		list.add("Rohit");
		list.add("Ravi");
		list.add("Rohan");
		list.add("Anand");
		list.add("Aryan");
		System.out.println(list);
		int length = list.size();
		System.out.println(length);
		
		for (int i = 0, j=length-1; i < j; i++,j--) {
			String temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
		System.out.println(list);
	}

}
