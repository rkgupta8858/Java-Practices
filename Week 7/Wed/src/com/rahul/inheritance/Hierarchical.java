package com.rahul.inheritance;

class Runnable{
	void run() {
		System.out.println(" Is running !!");
	}
}

class BikeRun extends Runnable{
	void run() {
		System.out.println("Bike is running !!");
	}
}

class CarRun extends Runnable{
	void run() {
		System.out.println("Car is running !!");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		CarRun carRun = new CarRun();
		BikeRun bikeRun = new BikeRun();

	}

}
