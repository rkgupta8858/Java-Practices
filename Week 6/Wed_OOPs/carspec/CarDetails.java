package com.rahul.oops.carspec;

public class CarDetails {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarModel("Tesla Cyber Truck");
		car.setModelYear("2020");
		car.setCarSpeed("300");
		
		System.out.println("Model is : "+car.getCarModel());
		System.out.println("Model Year is : "+car.getModelYear());
		System.out.println("Top Speed is : "+car.getCarSpeed());

	}

}
