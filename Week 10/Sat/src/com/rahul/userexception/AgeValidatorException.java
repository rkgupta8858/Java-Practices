package com.rahul.userexception;

public class AgeValidatorException extends Exception {

	public AgeValidatorException(String string) {
		super("You are not Eligible !!");
	}

}
