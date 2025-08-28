package com.rahul.interone;

public class BangaloreOne implements IAadharAuthentication {

	@Override
	public void register() {
		System.out.println("Registered Sucessful");
	}

	@Override
	public void approve() {
		System.out.println("Approved Sucessful");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspend Sucessful");
		
	}

	@Override
	public void changeAddress() {
		System.out.println("Address changed Sucessful");
		
	}

	@Override
	public void changeMobileNumber() {
		System.out.println("Mobile Number Changed Sucessful");
		
	}
}
