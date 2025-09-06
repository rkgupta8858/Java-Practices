package com.rahul.checkage;

// checked exception throw by user/ developer

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.ageVerification(18);
	}

	public void ageVerification(int age) {
		try {
			if(age<18) {
				throw new AgeValidatorException("age is greater then 18 !!");
			}
			else {
				System.out.println("You are Eligible for Voting @!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
