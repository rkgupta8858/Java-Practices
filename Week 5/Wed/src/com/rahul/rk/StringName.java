package com.rahul.rk;

public class StringName {

	public static void main(java.lang.String[] args) {
		
		String s1 = new String("Rahul");
		String s2 = new String("Rahul");
		
		System.out.println("Stored in String Constant Pool : "+(s1==s2));
		System.out.println("Stored in Heap : "+s1.equals(s2));
		
	}

}
