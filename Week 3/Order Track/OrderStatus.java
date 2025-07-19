import java.util.Scanner;

class OrderStatus
{
	static int orderId;
	public static void main(String args[])
	{		
		OrderStatus os = new OrderStatus();
		os.traceOrder(orderId);
	}
	public void traceOrder(int orderId)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter the Order ID : ");
		orderId = sc.nextInt();
		
		if(orderId==1)
		{
			System.out.println("Your order is at the BTM Bengaluru !");
		}
		else if(orderId==2)
		{
			System.out.println("Your order is at the J.P.Nagar,Bengaluru !");
		}
		else if(orderId==3)
		{
			System.out.println("Your order is at the Jaya Nagar,Bengaluru !");
		}
		else
		{
			System.out.println("No order Found : please select correct order id ! ");

		}
		
	}
}