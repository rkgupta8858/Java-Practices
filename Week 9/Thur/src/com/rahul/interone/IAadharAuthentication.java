package com.rahul.interone;

public interface IAadharAuthentication {
	
	void register();
	void approve();
	void suspend();
	default void changeAddress() {
		System.out.println("Address Changed Successful ");
	}
	default void changeMobileNumber() {
		System.out.println("Mobile number changed successful");
	}
}
