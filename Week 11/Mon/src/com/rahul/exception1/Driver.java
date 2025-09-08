package com.rahul.exception1;

public class Driver {

	public static void main(String[] args) {
		try {
			int a = 10/0;
		}
		catch (ArithmeticException ae) {
			System.out.println("Arithmatic exception occur !!");
		}
		finally {
			System.out.println("Finally block executed !!");
			try {
				System.out.println("Arithmatic finally try !!");
				int b=10/0;
			}
			catch (ArithmeticException ae) {
				System.out.println("Finally Arithamtic Exception !!");
			}
			
		}

	}

}
