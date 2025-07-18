class Method
{
	public static void main(String args[])
	{
		Method method = new Method();
		System.out.println("Hello Method !!");
		method.sumOfTwoNumber();
		method.subOfTwoNumber();
		method.mulOfTwoNumber();
		method.divOfTwoNumber();
	}
	
	
	public void sumOfTwoNumber()
	{
		int a = 100;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum of two number is : "+sum);
	}
	
	public void subOfTwoNumber()
	{
		int a = 100;
		int b = 20;
		int sub = a-b;
		System.out.println("Substraction of two number is : "+sub);
	}
	
	public void mulOfTwoNumber()
	{
		int a = 100;
		int b = 20;
		int mul = a*b;
		System.out.println("Multiplication of two number is : "+mul);
	}
	
	public void divOfTwoNumber()
	{
		int a = 100;
		int b = 20;
		int div = a/b;
		System.out.println("Divison of two number is : "+div);
	}
}