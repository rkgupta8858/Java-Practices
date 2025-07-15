import java.util.Scanner;

class GSTTax
{
	static int rate1 = 5;
	static int rate2 = 18;
	static int rate3 = 28;
	static int rateType;
	/* public void taxRate(int _rate1, int _rate2, int _rate3)
	{
		this.rate1 = _rate1;
		this.rate2 = _rate2;
		this.rate3 = _rate3;
	} */
	
	public int calculateGST(int itemPrice, String itemType)
	{
		int gst=0;
		if(rateType==1)
		{
			gst = (itemPrice*rate1)/100;
		
		}
		if(rateType==2)
		{
			gst = (itemPrice*rate2)/100;
		
		}
		if(rateType==3)
		{
			gst = (itemPrice*rate3)/100;
		
		}
		return gst;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item : ");
		String itemType = sc.next();
		
		System.out.print("Enter Item Price : ");
		int itemPrice = sc.nextInt();
		
		System.out.println("If you select 1 Rate=5%, If Select 2 Rate=18% and if select 3 then Rate=28%");
		System.out.print("Enter Rate Type (1 or 2 or 3) : ");
		rateType = sc.nextInt();
		
		GSTTax gsttax = new GSTTax();
		
		int gstprice = gsttax.calculateGST(itemPrice, itemType);
		System.out.println("GST us : "+gstprice);
		
		int finalPrice = itemPrice+gstprice;
		System.out.println("FinalPrice is : "+finalPrice);
		
	}
	
}