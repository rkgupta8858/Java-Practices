package com.rahul.testinterface;

// marker interface
interface IBanking{
	
}

@FunctionalInterface
interface IMobile{
	public abstract void m1();
//	public abstract void m2(); not allowed --> only one abstract method
	public default void m3() {
		
	}
	public default void m4() {
		
	}
}


// normal interface
interface IVehicle{
	public abstract void c1();
	public abstract void c2();
	public abstract void c3();
}


public class Test {

	public static void main(String[] args) {
		

	}

}
