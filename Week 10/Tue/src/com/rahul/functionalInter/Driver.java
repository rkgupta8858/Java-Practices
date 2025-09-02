package com.rahul.functionalInter;

public class Driver {

	public static void main(String[] args) {
		IAddNumber add = (a,b)->{
			return a+b;
		};
		int addTwo = add.addTwoNumber(10, 20);
		System.out.println("The Sum is : "+addTwo);
		
		int sub = add.subTwo(10, 5);
		System.out.println(sub);

	}

}
