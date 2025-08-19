package com.rahul.poly;

class Parent{
	public static void run() {
		System.out.println("Person is running !!");
	}
}


public class StaticPoly extends Parent {
	public static void run() {
		System.out.println("Static poly is running !!");
	}
	public static void main(String[] args) {
		Parent parent = new StaticPoly(); // here Parent method run due to Method Hiding
		parent.run();
		
		

	}

}
