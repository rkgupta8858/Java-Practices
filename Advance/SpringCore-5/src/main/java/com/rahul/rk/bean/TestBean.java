package com.rahul.rk.bean;

public class TestBean implements Test{
	private Employee employee;

	/*
	 * public void setEmployee(Employee employee) { this.employee = employee; }
	 */

	public TestBean(Employee employee) {
		super();
		this.employee = employee;
	}
	
	
	public void display() { 
		 System.out.println(employee);
	}


}
