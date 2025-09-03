package com.rahul.exception1;

public class Driver {

	public static void main(String[] args) {
		int a = 10;
		

		System.out.println("Driver.main()--> Started");
		try {
			int div = a / 0;
			System.out.println(div);
			System.out.println("Div successful !!");
		} catch (ArithmeticException ae) {
			System.out.println("Not divided by Zero(0) --> ArithmeticException occur");
		}

		System.out.println("Driver.main()--> Ended");

	}

}
