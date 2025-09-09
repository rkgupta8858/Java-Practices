package com.rahul.collections;

import java.util.ArrayList;

// Array List 

public class Driver {

	public static void main(String[] args) {
		ArrayList<String> empName = new ArrayList<String>();
		empName.add("Rahul");
		empName.add("Rohit");
		empName.add(null);
		empName.add("Rahul");
		empName.add("Ravi");
		empName.add("bittu");
		empName.add(null);
		System.out.println("Employees Name are : "+empName);
		System.out.println(empName.get(1));
	}

}
