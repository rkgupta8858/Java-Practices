package com.rahul.salary;

public class Salary {
	private String empName;
	private double empSal;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		if (empSal<0) {
			System.err.println("Error ! Salary can not be negative ");
		}
		else {
			this.empSal = empSal;
		}
	}	
}
