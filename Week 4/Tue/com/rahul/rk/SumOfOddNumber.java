package com.rahul.rk;
import java.util.Scanner;

class SumOfOddNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int secondNumber = sc.nextInt();
		
		
		if(firstNumber%2!=0 && secondNumber%2!=0)
		{
			int addOddNumber = firstNumber + secondNumber;
			System.out.println("Sum of odd Number is : "+addOddNumber);
		}
		else
		{
			System.out.println("Please enter only Odd numnber : ");
		}
	}
}