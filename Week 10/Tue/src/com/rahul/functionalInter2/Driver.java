package com.rahul.functionalInter2;

public class Driver {

	public static void main(String[] args) {
		IVehicle iv = (name, status) -> {
			System.out.println("Name is : "+ name+"\nStatus is :"+ status);
		};
		
		iv.m1("Rahul Kumar Gupta", "Running");
	}

}
