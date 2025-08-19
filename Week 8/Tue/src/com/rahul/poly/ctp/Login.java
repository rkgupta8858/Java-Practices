package com.rahul.poly.ctp;

public class Login {
	
	public void doLogin(String email, String pass) {
		System.out.println("Login through Email and Password !!");
	}
	public void doLogin(String mobile, int otp) {
		System.out.println("Login through Mobile and Otp !!");
	}
	public void doLogin(String secretToken) {
		System.out.println("Login through Secret Token !!");
	}
	public void doLogin(int pin) {
		System.out.println("Login through Pin !!");
	}

}
