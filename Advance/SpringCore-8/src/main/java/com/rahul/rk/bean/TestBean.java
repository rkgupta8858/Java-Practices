package com.rahul.rk.bean;

import java.util.Map;

public class TestBean implements Test {
	private Map<Integer,String> hobbies;

	public TestBean(Map<Integer, String> hobbies) 
	{
		super();
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "TestBean [hobbies=" + hobbies + "]";
	}





//	public void display() {
//		System.out.println(empName);	
//	}
	
	
}
