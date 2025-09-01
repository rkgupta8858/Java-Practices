package com.rahul.abstractInterface;

interface Demo
{
	void a();
	void b();
}

abstract class Test implements Demo{
	public void a() {
		System.out.println("A is executed");
	}
}
public class CheckAbstractAndInterface extends Test {

	public static void main(String[] args) {
		Test t = new CheckAbstractAndInterface();
		t.a();
		t.b();
	}

	@Override
	public void b() {
		System.out.println("B is executed");
	}
}
