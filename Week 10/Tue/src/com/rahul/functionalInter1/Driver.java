package com.rahul.functionalInter1;

public class Driver {

	public static void main(String[] args) {
		IMultiplication mul = (int a,int b) -> {
			return a*b;
		};
		
		ISubstraction subs = (a,b)->{
			return a-b;
		};
		
		int multi = mul.m1(10, 20);
		System.out.println("MultiPlication is : "+multi);
		
		int substract = subs.sub(20, 10);
		System.out.println("Substraction is : "+substract);
	}

}
