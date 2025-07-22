package com.rahul.rk;
import java.util.Scanner;

class ShippingCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Price : ");
		int productPrice = sc.nextInt();
		
		ShippingCost shippingCost = new ShippingCost();
		shippingCost.calculateShippingCost(productPrice);		
	}
	
	public void calculateShippingCost(int productPrice)
	{
		int shippingFee = 0;
		if(productPrice>=5000)
		{
			System.out.println("Shipping Cost : "+ shippingFee);
		}
		else if(productPrice>2000 && productPrice<5000)
		{
			shippingFee = shippingFee + 100;
			System.out.println("Shipping Cost : "+ shippingFee);
		}
		else
		{
			shippingFee = shippingFee + 200;
			System.out.println("Shipping Cost : "+ shippingFee);
		}
	}
}