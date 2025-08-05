package com.rahul.stringbuffer;

public class StringMethods {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Rahul");
		
		sb.append(" Guptak");
		System.out.println(sb);
		
		sb.deleteCharAt(11);
		System.out.println(sb);
		
		int len = sb.length();
		System.out.println(len);
		
		int cap = sb.capacity(); // amount of space reserved for String Buffer
		System.out.println(cap);
		
		StringBuffer del = sb.delete(6,sb.length());
		System.out.println(del);
		
		sb.insert(6, "Gupta");
		System.out.println(sb);
		
		sb.replace(6,sb.length(),"Kumar");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
