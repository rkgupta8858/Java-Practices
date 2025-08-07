package com.rahul.salary;

public class EmployeeSalary {

	public static void main(String[] args) {
		Salary salary = new Salary();
		salary.setEmpName("Rahul");
		System.out.println("Name is : "+ salary.getEmpName());
		
		salary.setEmpSal(50000);
		System.out.println("Salary is : "+ salary.getEmpSal() );
		
		salary.setEmpSal(-	50000);
		System.out.println("Remaining Salary is : "+ salary.getEmpSal() );

	}

}
