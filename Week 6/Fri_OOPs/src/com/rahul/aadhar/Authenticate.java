package com.rahul.aadhar;

public class Authenticate extends AadharRegistration {
	public void onlineRegistration()
	{
		boolean status =  registerAadhar("Rahul","15/04/2003", "BTM Bengalore");
		if (status== true) {
			System.out.println(status);
		}
		else
		{
			System.out.println("Unauthorized access");
		}
		
	}
}
