package com.rahul.exception;

// Finally block 

public class Driver {

	public static void main(String[] args) {
		String name = null;
		
		try {
			System.out.println("Try block started !!");
			name.length();
			System.out.println("Try block Ended !!");
			
		} 
		
		catch (NullPointerException ne) {
			System.err.println("Null pointer exception occur !!");
		}
		
		finally {
			
			System.out.println("Finally block executed !!");
			System.exit(0); // kill the jvm
		}
	}

}
