package com.rahul.initblock;

public class InitializationBlock {

	static {
		System.out.println("Static Initialization Block !!");
	}
	{
		System.out.println("Instance Initialization Block !!");
	}
	{
		System.out.println("Instance Initialization Block !!");
	}
	{
		System.out.println("Instance Initialization Block !!");
	}
	
	public InitializationBlock() {
		System.out.println("Constructor Block");
	}

	public static void main(String[] args) {
		
		InitializationBlock ib = new InitializationBlock();
	}

}
