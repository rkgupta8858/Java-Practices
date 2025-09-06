package com.rahul.unchecked;

public class AgeInvalidException extends RuntimeException {
	public AgeInvalidException() {
		super("Age should be > 18 ");
	}

}
