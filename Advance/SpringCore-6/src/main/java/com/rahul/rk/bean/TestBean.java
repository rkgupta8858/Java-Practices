package com.rahul.rk.bean;

import java.util.List;

public class TestBean implements Test {
	private List<String> empName;

	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Name Are : "+ empName;
	}


//	public void display() {
//		System.out.println(empName);	
//	}
	
	
}
