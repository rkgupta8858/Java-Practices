package com.rahul.rk.bean;

public class TestBean {
	private int empId;
	private String empName;
	private Double empSal;
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setEmpSal(Double empSal) {
		this.empSal=empSal;
	}
	
	public void display() {
		System.out.println("Id is : "+empId+ ", Name is : "+empName+ ", Salary is : "+empSal);
	}
}
