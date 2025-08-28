package com.rahul.interfaces;

public interface IBanking {
	public static void printPassBook() {
		
		// find printer code
		findPrinter();
		// connect printer code
		connectPrinter();
		// print
		print();
	}
	public static void printReceipt() {
		// find printer code
		findPrinter();
		// connect printer code
		connectPrinter();
		// print
		print();
	}
	
	private static void findPrinter() {
		
	}
	private static void connectPrinter() {
		
	}
	private static void print() {
		
	}

}
