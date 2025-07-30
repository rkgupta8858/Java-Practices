package com.rahul.rk;

public class StringProperties {
	public static void main(java.lang.String[] args) {

		String s1 = new String("Rahul");
		String s2 = new String("Rahul");

		System.out.println("Stored in String Constant Pool : " + (s1 == s2));
		System.out.println("Stored in Heap : " + s1.equals(s2));
		System.out.println("Character : " + s1.charAt(2));
		System.out.println("Length : " + s1.length());
		System.out.println("SubString : " + s1.substring(2));
		System.out.println("SubString : " + s1.substring(2,4));
		System.out.println("Upper Case: " + s1.toUpperCase());
		System.out.println("Lower Case : " + s1.toLowerCase());
		System.out.println("Remove Extra space : " + s1.trim());
		System.out.println("Contain word : " + s1.contains("R"));

	}

}
