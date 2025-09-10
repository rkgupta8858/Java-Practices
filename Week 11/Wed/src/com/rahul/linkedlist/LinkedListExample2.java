package com.rahul.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(10);
		list.add(9);
		list.add(78);
		list.add(45);
		list.add(55);
		System.out.println(list);
		
		list.add(2,11);
		System.out.println(list);

		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		it.remove();
		System.out.println(list);
	}
	

}
