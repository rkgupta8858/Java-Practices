package com.rahul.markerinterface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("Rahul");
		
		System.out.println(e.clone());
		
		Employee e1 = (Employee) e.clone();
		System.out.println(e1.toString());
		
		System.out.println(e1.name);
		
		System.out.println(e instanceof Cloneable);
		
	}

	
}
