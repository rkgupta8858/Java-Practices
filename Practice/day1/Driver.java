package com.rahul.inheritances;

class Parent{
	private void run() {
		System.out.println("Person Is running !!");
	}
	
	void prun() {
		run();
	}
}

class Child extends Parent{
	void run() {
		System.out.println("Child Is running !!");
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Parent p = new Child();
	//	p.run(); // The method run() from the type Parent is not visible
		p.prun();
		
		Child c = new Child();
		c.run();
	}

}
