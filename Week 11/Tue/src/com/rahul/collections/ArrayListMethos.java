package com.rahul.collections;

import java.util.ArrayList;

public class ArrayListMethos {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("Value are : "+al);
		System.out.println(al.contains(10));
		System.out.println(al.contains(101));
		
		System.out.println("Is it Empty : "+al.isEmpty());
		
		al.remove(4);
		System.out.println(al);
		
		al.retainAll(al);
		System.out.println("Retain all : "+al);
		
		System.out.println(al.size());
		
		al.removeAll(al);
		System.out.println("Remove all : "+al);
		
		System.out.println(al.toArray());
		al.add(101);
		al.add(102);
		al.add(103);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
		
		al.add(1001);
		al.add(1002);
		al.add(1003);
		al.add(1004);
		System.out.println(al);
		
		al1.add(1006);
		al1.add(1007);
		al1.add(1008);
		al1.add(1009);
		System.out.println(al1);
		
//		al.containsAll(al1);
		System.out.println("Contain all : "+al.contains(al1));
		
		al.addAll(al1);
		
		System.out.println(al);
		
		System.out.println(al.get(1));
		
		al.set(1, 1021);
		System.out.println(al);
		
		
		
		
	}

}
