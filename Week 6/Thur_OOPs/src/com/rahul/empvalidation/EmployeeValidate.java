package com.rahul.empvalidation;

public class EmployeeValidate {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setUserName("rkgupta8858");
		System.out.println("Employee Name is : "+ employee.getUserName());

		employee.setUserPass("Rahul@8858");
		System.out.println("Employee Password is : "+ employee.getUserPass());
	}

}
