package com.rahul.rk;

import java.util.Scanner;

public class StringInput1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Name :");
		String s1 = sc.next();

		System.out.print("Enter Second Name :");
		String s2 = sc.next();

		if (s1 == s2) {
			System.out.println("== is passed !!");
		} else if (s1.equals(s2)) {
			System.out.println(".equals() is passed !!");
		} else {
			System.out.println("Name not same !!");
		}
	}
}
/*
 * Even though both inputs are textually the same ("Rahul"), 
 * Java creates two different String objects in memory. 
 * This is because: Scanner.next() internally uses new String(...),
 * which creates a new object in the heap.
 * So, s1 and s2 do not point to the same memory location.
 */
