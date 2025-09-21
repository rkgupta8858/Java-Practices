package com.rahul.rk.bean;

public class TestBean implements Test {
	private Integer empId;
	private String empName;
	private Double empSal;
	public TestBean(Integer empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public void display() {
		System.out.println("Id is : "+empId+ ", Name is : "+empName+ " and Salary is : "+empSal);
	}
}
