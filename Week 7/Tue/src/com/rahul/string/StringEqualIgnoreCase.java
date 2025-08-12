package com.rahul.string;

public class StringEqualIgnoreCase {

	public static void main(String[] args) {
		String s1 = new String("rahul");
		String s2 = new String("Rahul");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
