package com.rahul.rk;
import java.util.Scanner;

class SumOfOddInArray
{
	public static void main(String args[])
	{
		int array[] = {10,20,13,11,22,21};
		int sum = 0;
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]%2!=0)
			{
				sum = sum + array[i];
				System.out.println("Odd Number : "+array[i]+ " --> and Position of This odd Number is : "+i);
			}
		}
		System.out.println("Sum of Odd Number in Given Array : "+sum);
	}
}

/* Output 

Odd Number : 13 --> and Position of This odd Number is : 2
Odd Number : 11 --> and Position of This odd Number is : 3
Odd Number : 21 --> and Position of This odd Number is : 5
Sum of Odd Number in Given Array : 45

*/