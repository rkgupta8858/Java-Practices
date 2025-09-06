package com.rahul.unchecked;

public class Driver {

	public static void main(String[] args) {
		int age = 18;
		try {
		if (age<18) {
			throw new AgeInvalidException();
		} else {
			System.out.println("Eligible for voting !!");
		}
		}
		catch (Exception e) {
			System.out.println("age must me greater than 18");
		}

	}

}
