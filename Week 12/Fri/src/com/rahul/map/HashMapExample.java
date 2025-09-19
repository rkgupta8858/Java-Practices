package com.rahul.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> empDetails = new HashMap<Integer, String>();
		empDetails.put(101, "Rahul");
		empDetails.put(102, "Rohit");
		empDetails.put(103, "Ravi");
		empDetails.put(104, "Rohan");
		empDetails.put(105, "Anand");
		empDetails.put(106, "Aryan");
		empDetails.put(101, "Rahul Kumar");
		empDetails.put(0, "Suresh");
		empDetails.put(null, "Rahul Kumar");
		empDetails.put(null, "Rahul Gupta");
		System.out.println(empDetails);
		System.out.println(empDetails.size());

		Set<Entry<Integer, String>> emp = empDetails.entrySet();
		Iterator<Entry<Integer, String>> itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
	}

}
