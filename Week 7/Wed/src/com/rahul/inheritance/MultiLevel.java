package com.rahul.inheritance;

class Parent{
	public void run() {
		System.out.println("Car is running !!");
	}
}

class Child extends Parent
{
	
	public void run() {
		super.run();
		System.out.println("Bike is running !!");
	}
}


public class MultiLevel extends Child{

	public static void main(String[] args) {
		MultiLevel multiLevel = new MultiLevel();
		multiLevel.run();
	}

}
