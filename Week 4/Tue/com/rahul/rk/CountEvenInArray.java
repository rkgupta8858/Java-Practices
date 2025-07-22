package com.rahul.rk;
import java.util.Scanner;

class CountEvenInArray
{
	public static void main(String args[])
	{
		int count=0;
		int array[] = {10,20,13,11,22,21};
		
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				System.out.println("The Even number is : "+array[i]);
				count++;
			}

		}
		System.out.println("Total Even Number in this Array is : "+count);
	}
}

/*
			<-- Output -->
			
The Even number is : 10
The Even number is : 20
The Even number is : 22
Total Even Number in this Array is : 3

*/