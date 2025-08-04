package com.rahul.rk;

public class StringPalindrome {

	public static void main(String[] args) {
		String s1 = "madaam";
		System.out.println(s1.length());
		boolean palindrom=true;
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
			{
				palindrom=false;
				break;
			}
		}
		if (palindrom) {
			System.out.println(s1 +" is Palindrom !!");
		} else {
			System.out.println(s1 +" is not Palindrom !!");
		}
		

	}

}
