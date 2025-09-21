package com.rahul.rk.bean;

import java.util.List;
import java.util.Set;

public class TestBean implements Test {
	private Set<String> hobbies;

//	public void setHobbies(Set<String> hobbies) {
//		this.hobbies = hobbies;
//	}

	public TestBean(Set<String> hobbies) {
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
