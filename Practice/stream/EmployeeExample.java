package com.rahul.stream;

import java.util.List;
import java.util.stream.Collectors;

class Employee {

	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return this.name+"-> "+this.id;
	}

}

 public class EmployeeExample {

	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("Rahul", 101), new Employee("Rohit", 102),
				new Employee("Ravi", 103));
		System.out.println(employees);

		List<String> empName = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(empName);
	}

}
