import java.util.Scanner;

class ZeptoDiscount
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order Amount : ");
		int orderValue = sc.nextInt();
		
		ZeptoDiscount zd = new ZeptoDiscount();
		zd.discount(orderValue);
		
	}
	
	public String categoryType(int orderValue)
	{	
	    String type;
		if(orderValue<1000)
		{
			type = "ordType";
		}
		else if((orderValue>=1000) && (orderValue<5000))
		{
			type = "regularType";
		}
		else 
		{
			type = "vipType";
		}	
    return type;		
	}
	
	public void discount(int orderValue)
	{		
		String type = categoryType(orderValue);
		
		switch(type)
		{
			case "ordType": 
			System.out.println("Customer get no Discount ");
			break;
			case "regularType": 
			System.out.println("Customer get 10% Discount ");
			break;
			case "vipType": 
			System.out.println("Customer get 20% Discount ");
			break;
			default:
			   System.out.print("Give valid input");
		}
		
	}
}