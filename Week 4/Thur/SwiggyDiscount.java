import java.util.Scanner;

class SwiggyDiscount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product price : ");
		int productPrice = sc.nextInt();
		
		SwiggyDiscount sd = new SwiggyDiscount();
		sd.discount(productPrice);
		
	}
	
	public String customerType(int amount)
	{
		String type = null;
		if(amount<1000)
		{
			type = "GreyType";
		}
		else if(amount>=1000 && amount<2000)
		{
			type = "SilverType";
		}
		else if(amount>=2000 && amount<5000)
		{
			type = "GoldType";
		}
		else
		{
			type = "PlatinumType";
		}
		return type;
	}
	
	public void discount(int amount)
	{
		String type = customerType(amount);
		switch(type)
		{
			case "GreyType" :
			System.out.println("Customer Get only free delivery !!");
			break;
			
			case "SilverType" :
			System.out.println("Customer Get 10% discount !!");
			break;
			
			case "GoldType" :
			System.out.println("Customer Get 20% discount !!");
			break;
			
			case "PlatinumType" :
			System.out.println("Customer Get 30% discount !!");
			break;
			
			default : 
			System.out.println("No discount !!");
		}
	}

}
