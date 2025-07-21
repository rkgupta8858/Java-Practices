package com.rahul.rk;
import java.util.Scanner;

class ECommerce
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product price");
		int productPrice = sc.nextInt();
		
		ECommerce ec = new ECommerce();
		
		int finalPrice = ec.discount(productPrice);
		
		System.out.println("Product price is : "+ finalPrice);
		
		
	}
	
	public int discount(int price)
	{
		int discount = 0;
		int finalPrice = 0;
		if(price>=10000)
		{
			discount = price*20/100;
			finalPrice = price - discount;
		}
		else if(price<10000)
		{
			finalPrice = price;
		}
		else
		{
			finalPrice = price;
		}
		return finalPrice;
	}
}
