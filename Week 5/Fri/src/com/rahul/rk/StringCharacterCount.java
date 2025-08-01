package com.rahul.rk;

public class StringCharacterCount {

	public static void main(String[] args) {
		String s1 = "Kodewala";
		
		char[] c= s1.toCharArray();
		
		int count = 0;
		for(int i=0; i<c.length;i++)
		{
			count++;
		}
		System.out.println(count);

	}

}
