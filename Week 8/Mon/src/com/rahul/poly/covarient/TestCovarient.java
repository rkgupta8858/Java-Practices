package com.rahul.poly.covarient;

class Vehicle {
   Vehicle run() {
	   System.out.println("Vehicle is running !!");
	   return this;
   }
}
class Bike extends Vehicle{
	Bike run() {
		   System.out.println("Bike is running !!");
		   return this;
	   }
}

public class TestCovarient
{
	
	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.run();
	}
}