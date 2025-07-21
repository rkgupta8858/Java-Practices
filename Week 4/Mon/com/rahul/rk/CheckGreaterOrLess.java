package com.rahul.rk;
import java.util.Scanner;

class CheckGreaterOrLess
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter Second Number :" );
		int secondNumber = sc.nextInt();
		
		CheckGreaterOrLess cgl = new CheckGreaterOrLess();
		String result = cgl.checkGreaterLess(firstNumber, secondNumber);
		System.out.println(result);
		
	}
	
	public String checkGreaterLess(int firstNumber, int secondNumber)
	{
		String result=null;
		if(firstNumber>secondNumber)
		{
			result = "First Number is Greater than Second Number";
		}
		else if(firstNumber<secondNumber)
		{
			result = "Second Number is Greater than First Number";
		}
		else
		{
			result = "Both Number are Equal";
		}
		return result;
			
	}
}