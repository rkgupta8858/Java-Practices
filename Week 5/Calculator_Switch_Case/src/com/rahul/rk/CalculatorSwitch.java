package com.rahul.rk;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		System.out.println("Welcome to this Calculator which is Developed by using Switch Case !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int secondNumber = sc.nextInt();
		
		System.out.println("For Add : Press 1");
		System.out.println("For Sub : Press 2");
		System.out.println("For Mul : Press 3");
		System.out.println("For Div : Press 4");
		System.out.println("For Mod : Press 5");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Sum is : "+ (firstNumber + secondNumber));
			break;
		case 2:
			System.out.println("Sub is : "+ (firstNumber - secondNumber));
			break;
		case 3:
			System.out.println("Mul is : "+ (firstNumber * secondNumber));
			break;
		case 4:
			System.out.println("Div is : "+ (firstNumber / secondNumber));
			break;
		case 5:
			System.out.println("Mod is : "+ (firstNumber % secondNumber));
			break;

		default:
			System.out.println("Please Enter a Valid Choice !!");
			break;
		}

	}

}
