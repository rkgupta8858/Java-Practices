package com.rahul.exception;

class Parent{
	void demo() throws Exception{
		System.out.println("This is Parent Class !!");
	}
}

class Child extends Parent{
	void demo() throws NullPointerException{
		System.out.println("This is Child Class !!");
	}
	
}


public class PolyException {

	public static void main(String[] args) throws Exception {
		Parent parent = new Child();
		parent.demo();
	}

}
