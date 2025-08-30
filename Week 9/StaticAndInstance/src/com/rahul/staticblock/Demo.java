package com.rahul.staticblock;

public class Demo {
	static int a = 10;
	static {
		m1();
		System.out.println("1st Static block executed !!");
	}
	static void m1() {
		System.out.println(a);
		System.out.println(j);
	}
	
	static {
		System.out.println("2nd Static block !!");
	}
	static int j=20;
	static {
		System.out.println(a);
		System.out.println(j);
	}
	public static void main(String[] args) {
		
	}
}
