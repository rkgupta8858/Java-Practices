package com.rahul.constructor;

class Employee1{
	private Employee1() {
		System.out.println("Private Constrctor called !!");
	}
	
	public static Employee1 createInstance() {
		System.out.println("private");
		return new Employee1();
	}
}



public class PrivateConstructor {

	public static void main(String[] args) {
		Employee1 employee1 =Employee1.createInstance();

	}

}
