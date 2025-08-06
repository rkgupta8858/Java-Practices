package com.rahul.oops.encapsulation;

public class SetterGetter {
	private int age;

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		if(age>=18)
		{
			this.age = age;
		}
		else {
			System.out.println("Not valid For Driving !!");
		}
	}

}
