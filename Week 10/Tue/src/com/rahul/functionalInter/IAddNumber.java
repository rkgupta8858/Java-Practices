package com.rahul.functionalInter;

@FunctionalInterface
public interface IAddNumber {
	int addTwoNumber(int a , int b);
	
	
	public default int subTwo(int a , int b) {
		return a-b;
	}

}
