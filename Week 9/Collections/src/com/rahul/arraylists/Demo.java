package com.rahul.arraylists;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList  al = new ArrayList();
		al.add(100);
		al.add("Rahul");
		al.add(101);
		al.add("Akon");
		al.add(102);
		al.add("Krishna");
		System.out.println(al);
		al.add(100);
		
		al.remove(5);
		System.out.println(al);
		
		al.add(5, "krishna");
		System.out.println(al);
		System.out.println(al.get(1));
		
		al.set(1, "Rahul Kumar");
		System.out.println(al);
		
		System.out.println(al.indexOf(101)); // 2
		
		System.out.println(al.contains(101)); // true
		
		System.out.println(al.lastIndexOf(100));
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.clone());
		
		al.clear();
		
		System.out.println(al);
	}

}
