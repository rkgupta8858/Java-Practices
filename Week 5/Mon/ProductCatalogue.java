import java.util.Scanner;

class Product
{
	public String products(String productName)
	{
		String product[] = new String[5];
		product[0] = "oppo";
		product[1] = "vivo";
		product[2] = "realme";
		product[3] = "apple";
		product[4] = "mi";
		
		//System.out.println(product[]);
		String name = null;
		
		boolean productFound = false;
		
		for(int i=0; i<=product.length-1;i++)
		{
			if(productName.equals(product[i]))
			{
				productFound = true;
				name ="Product Exist";
				break;
			}
		}
		if(!productFound)
		{
			name ="Product Not Exist";
		}
		return name;
	}
}

class ProductCatalogue
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Product Name :");
		String productName = sc.next();
		Product p = new Product();
		
		String findProduct = p.products(productName);
		System.out.println(findProduct);
		
	}
}