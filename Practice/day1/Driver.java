package com.rahul.inheritsame;

class Parent{
	int a = 10;
	void show() {
		System.out.println("Parent : "+a);
	}
}

class Child extends Parent{
	int a = 20;
	void show() {
		System.out.println("Child : "+a);
		System.out.println("Parent using super : "+super.a);
	}
}


public class Driver {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.a);
		p.show();
		
		Child c = new Child();
		System.out.println(c.a);
	}

}