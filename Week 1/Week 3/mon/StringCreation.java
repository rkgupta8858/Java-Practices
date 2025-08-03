package com.rahul.rk;

public class StringCreation {

	public static void main(String[] args) {
		String s1= "Rahul";
		String s2 = new String("Rahul");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
