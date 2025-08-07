package com.rahul.immutable;

public class EmployeeImmutability {

	public static void main(String[] args) {
		Employee employee = new Employee(101,"Rahul",60000);
		
		System.out.println("Employee Id is : " + employee.getId());
		System.out.println("Employee Name is : " + employee.getName());
		System.out.println("Employee Salary is : " + employee.getSalary());
	}

}
