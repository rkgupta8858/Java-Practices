package com.rahul.empvalidation;

public class Employee {
	private String userName;
	private String userPass;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if (userName.equals("rkgupta8858")) {
			this.userName = userName;
		}
		else {
			System.err.println("Please enter a Valid User Name !!");
		}
		
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		if (userPass.equals("Rahul@8858")) {
			this.userPass = userPass;
		}
		else {
			System.err.println("Please enter a Valid User Password !!");
		}
	
	}

}
