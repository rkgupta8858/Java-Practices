package com.rahul.rk;
import java.util.Scanner;

class Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		Table t = new Table();
		t.tablePrint(number);
		
	}
	
	public void tablePrint(int number)
	{
		for(int i=1; i<=10; i++)
		{
			int table = number*i;
			System.out.println(number+" * "+i+" = "+table);
		}
	}
}