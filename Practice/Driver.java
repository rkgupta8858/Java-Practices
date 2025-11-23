package com.rahul.hashset;

import java.util.HashSet;
import java.util.Iterator;

class Employee {
	String name;

	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return this.name.equals(employee.name);
	}
	
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Driver {

	public static void main(String[] args) {

		Employee e1 = new Employee("Patra");

		Employee e2 = new Employee("Patra");

		HashSet<Employee> set = new HashSet<Employee>();

		set.add(e1);
		set.add(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(set);
		
		String s1 = "Rahul";
		String s2 = "Rahul";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Iterator<Employee> iterator = set.iterator();

	}

}
