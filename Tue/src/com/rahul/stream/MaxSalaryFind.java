package com.rahul.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {

	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {

		return this.name + " -> " + this.salary;
	}
}

public class MaxSalaryFind {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Rahul", 50000), new Employee("Rohit", 60000),
				new Employee("Ravi", 70000));
		Employee maxSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow();
		System.out.println(maxSalary);
	}

}
