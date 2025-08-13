package com.rahul.chaining;

class Employee {
	int id;
	String name;
	
	public Employee() {
		this(101,"Rahul");
	}
	
	Employee(int _id, String _name){
		this.name=_name;
		this.id=_id;
		System.out.println(id +" "+name);
	}
	
}

class Manager extends Employee
{
	String department;
	public Manager() {
		this("Computer Science");
		}

	Manager(String _department) {
		super();
		this.department=_department;
		System.out.println(department);
	}
	
}

public class EmployeeDeatils{
	public static void main(String[] args) {
		Manager manager = new Manager();
	}
}