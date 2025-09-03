package com.rahul.exception;

// null pointer exception

public class Driver {

	public static void main(String[] args) {

		System.out.println("Started !!");
		String empName = null;
		try {
			System.out.println(empName.length());
			System.out.println("Length calculated Successful !!");
		} 
			catch (Exception e) {
			System.out.println("Name is null--> Null Pointer exception occar");
		}
		System.out.println("Ended !!");
	}

}