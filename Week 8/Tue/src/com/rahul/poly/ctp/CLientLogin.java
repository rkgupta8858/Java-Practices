package com.rahul.poly.ctp;

public class CLientLogin {

	public static void main(String[] args) {
		Login login = new Login();
		login.doLogin("rkgupta9129@gmail.com", "Rahul@1234");
		
		login.doLogin("8922082335", 854565);
		
		login.doLogin("Rk@123");

		login.doLogin(273158);
	}

}
