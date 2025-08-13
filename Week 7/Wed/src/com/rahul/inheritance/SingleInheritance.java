package com.rahul.inheritance;

class Single {
	void singleMethod(){
		System.out.println("Single Inheritance !!");
	}
}

public class SingleInheritance extends Single {

	public static void main(String[] args) {
		Single singleInheritance = new SingleInheritance();
		singleInheritance.singleMethod();
	}
	
	void singleMethod()
	{
		System.out.println("Parent Class method !!");
	}

}
