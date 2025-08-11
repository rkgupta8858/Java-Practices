package com.rahul.constructor;

public class ConstructorCreate {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee1 = new Employee(100);

	}

}

class Employee
{
	private int empId;
	
	public Employee() {
		System.out.println("Rahul");
	}

	public Employee(int i) {
		System.out.println(i);
	}
	
	
}
