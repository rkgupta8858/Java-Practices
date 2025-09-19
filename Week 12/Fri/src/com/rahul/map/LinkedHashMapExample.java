package com.rahul.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> emp = new LinkedHashMap<Integer, String>();
		emp.put(101, "Rahul");
		emp.put(102, "Abhishek");
		emp.put(103, "Ravi");
		emp.put(104, "Aryan");
		emp.put(105, "krishna");
		emp.put(106, "krishna1");
		emp.put(107, "krishna2");
		emp.put(108, "krishna3");
		emp.put(109, "krishna4");
		emp.put(110, "krishna5");
		emp.put(111, "krishna6");
		emp.put(112, "krishna7");
		emp.put(113, "krishna8");
		System.out.println(emp);
		System.out.println(emp.size());
		
		emp.remove(113);
		System.out.println(emp);
		System.out.println(emp.size());
	
		emp.putIfAbsent(110, "Rahul Gupta"); // no insert because 110 is already present
		System.out.println(emp);
		
		System.out.println(emp.get(101));
		System.out.println(emp.getOrDefault(101, "Default Value")); // 101 exist --> 'Default Value' not print
		System.out.println(emp.getOrDefault(1010, "Default Value")); // 1010 not exist --> 'Default value' print
		
	}
}
