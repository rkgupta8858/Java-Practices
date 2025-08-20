package com.rahul.abstractmethod;

abstract class College {
	
	public abstract void name();
	
}

public class Driver extends College {

	
	@Override
	public void name() {
		System.out.println("This is College class");
		
	}
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.name();
	}

	

}
