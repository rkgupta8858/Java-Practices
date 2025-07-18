import java.util.Scanner;
class SellerBuyerProject
{
	public static void main(String args[])
	{
		int finalPrice = 0;
		// seller section start from here
		System.out.println("Please add the Products :");
		
		Scanner sc = new Scanner(System.in);
		
		// 1st product add by seller
		System.out.print("Enter the Product 1 Name : ");
		String product1 = sc.nextLine();
		
		System.out.print("Enter the Product 1 Specification : ");
		String product1Specification = sc.nextLine();
		
		System.out.print("Enter the Product 1 Price : ");
		int product1Price = sc.nextInt();
		
		System.out.println("***********************");
		
		// 2nd product add by seller
		System.out.print("Enter the Product 2 Name : ");
		String product2 = sc.nextLine();
		product2 = sc.nextLine();
		
		System.out.print("Enter the Product 2 Specification : ");
		String product2Specification = sc.nextLine();
		
		System.out.print("Enter the Product 2 Price : ");
		int product2Price = sc.nextInt();
		
		// seller section end here
		
		System.out.println("***********************");
		
		// Buyer section start from here 
		
		System.out.print("Please select 1 or 2 : ");
		
		int choise = sc.nextInt();
		
		if(choise == 1)
		{
			System.out.println("The details of choise " +choise+" is : ");
			System.out.println("Product name is : "+product1);
			System.out.println("Product Specification is : "+product1Specification);
			System.out.println("Product price is : "+product1Price );
			
			// GST include here
			int gstPrice = product1Price*18/100;
			System.out.println("GST on this Product is : "+gstPrice);
			
			int priceWithGST = product1Price + gstPrice;
			System.out.println("Final price of this Product is : "+priceWithGST);
			
			System.out.print("Choose the quantity : ");
			int quantity = sc.nextInt();
			
			finalPrice = priceWithGST * quantity;
			System.out.println("Final Cart Value is : "+ finalPrice);
			System.out.println("***********************");
		}
		else if(choise == 2)
		{
			System.out.println("The details of choise " +choise+" is : ");
			System.out.println("Product name is : "+product2);
			System.out.println("Product Specification is : "+product2Specification);
			System.out.println("Product price is : "+product2Price );
			
			// GST include here
			int gstPrice = product2Price*18/100;
			System.out.println("GST on this Product is : "+gstPrice);
			
			int priceWithGST = product2Price + gstPrice;
			System.out.println("Final price of this Product is : "+priceWithGST);
			
			System.out.print("Choose the quantity : ");
			int quantity = sc.nextInt();
			
			finalPrice = priceWithGST * quantity;
			System.out.println("Final Cart Value is : "+ finalPrice);
			System.out.println("***********************");
		}
		else
		{
			System.out.println("Incorrect Choice");
		}
		
		
		if(choise==1 || choise==2)
		{
			System.out.println( finalPrice);
			System.out.print("Enter your Name : ");
			String name = sc.nextLine();		
			name = sc.nextLine();		

			System.out.print("Enter your Mobile Number : ");
			long mobNum = sc.nextLong();
			
			System.out.print("Enter your Email : ");
			String email = sc.nextLine();
			email = sc.nextLine();
			
			System.out.print("Enter Your Address : ");
			String address = sc.nextLine();
			
			System.out.println("Your Order Details is submitted !!");
			System.out.println("For Place your order write 'Yes' ");
			
			String confirmation = sc.next();
			
			if(confirmation.equals("Yes"))
			{
				System.out.println("Your Order has been submitted Successfully !!");
				System.out.println("It will be delivered within 3 days !!");
				System.out.println("You can trace your order in the Order Session");
				System.out.println("your order has been send to your number and email");
			}
			else
			{
				System.out.println("Your order is not placed !! ");
			}
		}
		
	}	
}