package com.rahul.rk;
import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number : ");
		int num = sc.nextInt();
		
		EvenOdd eo = new EvenOdd();
		eo.evenOddCheck(num);
	}
	public void evenOddCheck(int num)
		{
			if(num%2==0)
			{
				System.out.print("Number is Even ");
			}
			else
			{
				System.out.print("Number is Odd");
			}
		}
}