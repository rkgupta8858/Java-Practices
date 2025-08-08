package com.rahul.aadhar;

public class AadharRegistration {

	private String name;
	private String dob;
	private String add;
	
	public boolean registerAadhar(String name, String dob, String add)
	{
		this.name = name;
		this.dob = dob;
		this.add = add;
		System.out.println(name);
		System.out.println(dob);
		System.out.println(add);
		return true;
		
	}
}
