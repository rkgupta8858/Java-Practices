package com.rahul.collections;

import java.util.ArrayList;

public class StringReverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rahul");
		al.add("Rohit");
		al.add("Ravi");
		al.add("Aryan");
		al.add("Anand");
		System.out.println(al);
		
		for (int i = al.size()-1; i>=0; i--) {
			System.out.print(al.get(i)+", ");
		}
		System.out.println();
		System.out.println(al);
		
		for (int i = 0, j = al.size()-1; i < j; i++, j--) {
				String swap = al.get(i);
				al.set(i, al.get(j));
				al.set(j, swap);
		}
		System.out.println(al);
	}

}
