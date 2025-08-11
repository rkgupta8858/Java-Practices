package com.rahul.inheritance;

public class EmployeeDetails extends Employee
{

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Rahul Kumar Gupta");
		employee.setEmpSal(50000.0);
		
		System.out.println("Employee Id : "+employee.getEmpId());
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Salary : "+employee.getEmpSal());

	}

}
