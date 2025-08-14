package com.rahul.poly;

class A{
	void show()
	{
		System.out.println("Show Balance : A");
	}
}

public class B extends A {
	
	void show()
	{
		System.out.println("Show Balance : B");
	}

	public static void main(String[] args) {
		
		A a = new B();
		a.show();
		
//		B b = (B)new A();
//		b.show();
	}

}
