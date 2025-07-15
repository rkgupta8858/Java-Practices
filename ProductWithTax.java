import java.util.Scanner;

class ProductWithTax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Name : ");
		String product = sc.next();		
		
		System.out.print("Enter Product Price : ");
		int price = sc.nextInt();
		
		ProductWithTax pwt = new ProductWithTax();
		
		int gstOnProduct = pwt.taxCalculate(product, price);		
		System.out.println("GST on this product is : "+gstOnProduct);
		
		int finalPrice = price+gstOnProduct;
		System.out.println("Final Price of This Product is : "+finalPrice);
		
	}
	public int taxCalculate(String product, int price)
	{
		int gst = 0;
		if(price<=19999)
		{
			gst = (price*18)/100;
		}
		else if(price>=20000)
		{
			gst = (price*18)/100;
		}
		else
		{
			System.out.println("Not valid ");
		}
		return gst;
	}
}