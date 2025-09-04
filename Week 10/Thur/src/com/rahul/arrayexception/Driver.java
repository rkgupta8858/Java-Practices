package com.rahul.arrayexception;

public class Driver {

	public static void main(String[] args) {
		String [] arr = {"rahul","rohit", "ravi","akon"};
		String name = null;
		try {
			
			System.out.println(arr[5]);
			
		} 
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Started");
			ae.printStackTrace();
			System.out.println("Ended");
		}
		try {
			System.out.println(name.length());
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		
		

	}

}
