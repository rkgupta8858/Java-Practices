package com.rahul.stringbuffer;

public class StringBuilderRevesre {

	public static void main(String[] args) {
		String sb = "rahul";
		StringBuilder reverse = new StringBuilder();
		for(int i=0; i<sb.length(); i++) {
			reverse.append(' ');
		}
		
		for(int i=0; i<sb.length(); i++)
		{
			reverse.setCharAt(i,sb.charAt(sb.length()-1-i));
		}
			System.out.println(reverse);
	}

}
