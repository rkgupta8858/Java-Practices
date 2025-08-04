package com.rahul.rk;

import java.util.Iterator;

public class StringReverse {

	public static void main(String[] args) {
		String s = "rahul";
		
		char[] ch = s.toCharArray();
		
		System.out.println(ch);
		System.out.println(ch[1]);

		int length = ch.length;
	
		System.out.println(length);
		
		for (int i = length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		String s1 = "Rahul Kumar Gupta";
		
		System.out.println(s1);
		char ch1[] = s1.toCharArray();
		System.out.println(ch1.length);
		
		for (int i = ch1.length-1; i >=0; i--) {
			System.out.print(ch1[i]);
		}

	}

}
