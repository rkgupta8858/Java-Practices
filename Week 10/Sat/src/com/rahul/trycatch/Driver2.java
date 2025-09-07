package com.rahul.trycatch;

public class Driver2 {

	public static void main(String[] args) {
		stringValue();
		System.out.println("main end");

	}
	
	public static void stringValue() throws NullPointerException {
		String name = null;
		System.out.println("Start");
		System.out.println(name.length());
		System.out.println("End");
	}

}
