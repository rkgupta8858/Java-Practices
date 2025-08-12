package com.rahul.constructorchaining;

class Employee
{
	String name;
	public Employee(String name) {
		this.name=name;
		System.out.println(name+" is an Employee !!");
	}
}

class Admin extends Employee
{
//	String department;
	Admin(String name, String department)
	{
		super(name);
	//	this.department=department;
		System.out.println(name+" "+ department);
	}
	
}
public class ConstChaining {

	public static void main(String[] args) {
		Admin admin = new Admin("Rahul", "IT");
	}

}
