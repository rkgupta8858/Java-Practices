package com.rahul.inta;

class P
{
	P(int a){
		System.out.println("Hello P");
	}
}

public class A extends P {

	A(int a) {
		super(a);
	}

	public static void main(String[] args) {
	
		P p = new A(10);
	}
}
