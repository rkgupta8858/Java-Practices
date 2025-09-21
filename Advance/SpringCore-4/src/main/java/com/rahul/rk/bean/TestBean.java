// Predefined Class Example

package com.rahul.rk.bean;

import java.util.Date;

public class TestBean implements Test {
	private Date doj;

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public void display() {
		System.out.println("Current Joining Date is : " +doj);
	}
}
