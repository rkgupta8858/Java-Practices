package com.rahul.userexception;

public class Driver {

	public static void main(String[] args) throws AgeValidatorException {
		Driver driver = new Driver();
		driver.ageVerification(9);
	}

	public void ageVerification(int age) throws AgeValidatorException {

		if (age < 18) {
			System.out.println("Not eligible !!");
			throw new AgeValidatorException("Age Should be greater than @18 !!");
			
		} else {
			System.out.println("You are Eligible for Voting !!");
		}
	}

}
