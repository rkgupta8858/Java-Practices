package com.rahul.chaining;

class EmployeeDetails {

	public EmployeeDetails(int id, String empName) {
		System.out.println("Id is : " + id + "\nName is : " + empName);
	}
}

class Employee extends EmployeeDetails {
	int empId;
	String empName;

	public Employee(int _empId, String _empName) {
		super(_empId, _empName);
		this.empId = _empId;
		this.empName = _empName;
	}

	@Override
	public String toString() {
		return "Employee{id=" + empId + ", name='" + empName + "'}";
	}
}

public class EmployeeData {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Rahul Kumar Gupta");
		System.out.println(employee);

	}
}
