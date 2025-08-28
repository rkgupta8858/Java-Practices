package com.rahul.interone;

public class ESeva implements IAadharAuthentication {

	@Override
	public void register() {
		System.out.println("Registered Sucessful  via eseva");
	}

	@Override
	public void approve() {
		System.out.println("Approved Sucessful via eseva");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspend Sucessful via eseva");
		
	}

	public void changeAddress() {
		System.out.println("Address changed Sucessful via eseva");
		
	}

	public void changeMobileNumber() {
		System.out.println("Mobile Number Changed Sucessful via eseva");
		
	}

}
