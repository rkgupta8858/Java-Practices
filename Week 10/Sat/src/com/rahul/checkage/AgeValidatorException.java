package com.rahul.checkage;

public class AgeValidatorException extends Exception {
	public AgeValidatorException() {
		super("Age must be Greater Than 18");
	}

	public AgeValidatorException(String message) {
		super(message);
	}
}
