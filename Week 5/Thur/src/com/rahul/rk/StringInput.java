package com.rahul.rk;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Name : ");
		String s1 = new String(sc.next());

		System.out.print("Enter Second Name : ");
		String s2 = new String(sc.next());

		if (s1 == s2) {
			System.out.println("== Operator Are passed ");
		} else if (s1.equals(s2)) {
			System.out.println(".equals() Are Passed");
		} else {
			System.out.println("Name are Not Same");
		}
	}

}
