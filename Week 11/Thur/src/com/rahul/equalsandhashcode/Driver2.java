package com.rahul.equalsandhashcode;

class Employee{
	private Integer number;
	
	public Employee(Integer number) {
		this.number = number;
	}
	
	public boolean equals(Employee obj) {
		return this.number.equals(obj.number);
	}
	
	public int hashCode() {
		return this.number.hashCode();
	}
}


public class Driver2 {

	public static void main(String[] args) {
		Employee employee = new Employee(10);
		Employee employee1 = new Employee(10);
		System.out.println(employee==employee1); 
		System.out.println(employee.equals(employee1));
		
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());

	}

}
