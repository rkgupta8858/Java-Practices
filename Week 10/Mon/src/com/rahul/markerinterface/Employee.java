package com.rahul.markerinterface;

public class Employee implements Cloneable{
	
	public String name;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

	public Employee(String name) {
		this.name = name;
	}
	
	

}
