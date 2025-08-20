package com.rahul.vehicle;

abstract class Vehicle {
	public abstract void startEngine();
}

class Car extends Vehicle {

	public void startEngine() {
		System.out.println("Car is Running !!");

	}
}

class Bike extends Vehicle {

	public void startEngine() {
		System.out.println("Bike is Running !!");
	}

}

public class Driver {

	public static void main(String[] args) {

		Vehicle v = new Car();
		v.startEngine();
		
		Vehicle v1 = new Bike();
		v1.startEngine();
	}

}
