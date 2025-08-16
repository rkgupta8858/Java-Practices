package com.rahul.rk;

class Parent{
	public void demo() {
		System.out.println("This is Parent Class !!");
	}
}
class Child extends Parent{
	public void demo() {
		System.out.println("This is Child Class !!");
	}
}



public class TestException extends Child{
	public void demo() {
		System.out.println("This is Test Exception Class !!");
	}
	

	public static void main(String[] args) {
		TestException te = new TestException();
		te.demo();
	//	te.demo1(); throw Exxception
	}

}
