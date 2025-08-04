package com.rahul.rk;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = "Rahul";
		String s2 = new String("Rahul");
		
		System.out.println(s1==s2);  // false
		
		s2 = s2.intern();  
		System.out.println(s1==s2);
		
	}

}
