package com.rahul.rk;
import java.util.Scanner;
class CheckPositive
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		CheckPositive cp = new CheckPositive();
		boolean result = cp.checkPositiveNum(num);
		System.out.println("Number is positive : "+result);
	}
	public boolean checkPositiveNum(int num)
	{
		if(num>=0)
		{
			return true;
		}
		return false;
	}
}