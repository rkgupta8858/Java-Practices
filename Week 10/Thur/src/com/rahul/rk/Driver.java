package com.rahul.rk;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Started !!");
		String name = null;
		
		try {
			Class.forName("com.rahul.rk");
			System.out.println("Try block Started ");
			name.length();
			System.out.println("Try block Ended ");
		} 
		catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch (NullPointerException ne) {
			ne.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Catch block Started !!");
			e.printStackTrace();
			System.out.println("Catch block Ended !!");
		}

	}

}
