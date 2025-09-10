package com.rahul.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rahul");
		list.add("Rohit");
		list.add("Ravi");
		list.add("Rohan");
		list.add("Anand");
		list.add("Aryan");
		
		System.out.println(list);
		
		list.add(1, "Bittu");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		list.peek();
		System.out.println(list.peek());
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list);
		
		list.offer("rahul");
		System.out.println(list);
	}

}
