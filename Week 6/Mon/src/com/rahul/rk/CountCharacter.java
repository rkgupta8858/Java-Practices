package com.rahul.rk;

public class CountCharacter {

	public static void main(String[] args) {
		String input = "I am from Bengalore Karnataka";
		 
		System.out.println("Using length method : "+input.length()); 
		
		char[] ch = input.toCharArray();
		
		System.out.println("Using length proparty : "+ch.length);
		
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' ') {
				count++;
			}
		}
		System.out.println("Using Loop : "+count);
		
		
		String input1 = "I am from Bengalore Karnataka";
		String[] arr = input1.split(" ");
		System.out.println(arr.length);
	}

}
