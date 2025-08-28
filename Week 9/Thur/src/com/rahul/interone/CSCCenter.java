package com.rahul.interone;

public class CSCCenter implements IAadharAuthentication {

	@Override
	public void register() {
		System.out.println("Registered Sucessful via CSC");
	}

	@Override
	public void approve() {
		System.out.println("Approved Sucessful via CSC");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspend Sucessful via CSC");
		
	}

	public void changeAddress() {
		System.out.println("Address changed Sucessful via CSC");
		
	}

	public void changeMobileNumber() {
		System.out.println("Mobile Number Changed Sucessful via CSC");
		
	}

}
