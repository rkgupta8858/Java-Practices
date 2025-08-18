package com.rahul.poly;

class Parent {
	public void demo() {
		System.out.println("This is Parent !!"+this.getClass().getName());
		System.out.println("This is Parent !!"+this.getClass().getName().codePointAt(15)); // unicode print of particular character
		System.out.println("This is Parent !!"+this.getClass().getName().charAt(0));
		System.out.println("This is Parent !!"+this.getClass().getName().charAt(1));
		System.out.println("This is Parent !!"+this.getClass().getName().charAt(2));
		System.out.println("This is Parent !!"+this.getClass().getName().charAt(3));
		System.out.println("This is Parent !!"+this.getClass().getName().charAt(4));
		System.out.println("This is Parent !!"+this.getClass().getName().charAt(5));
		System.out.println("This is Parent !!"+this.getClass().getName().codePointBefore(16));
	}

}

class Child extends Parent
{
	public void demo() {
		System.out.println("This is Child !!");
	}
}

public class TestPoly{
	public static void main(String[] args) {
		Child child = new Child();
		child.demo();
		
		Parent parent = new Parent();
		parent.demo();
		Parent parent1 = new Child();
		parent.demo();
	}
}