class InstanceVariable
{
	int amount = 200;
	char ch;
	public static void main(String args[])
	{
		System.out.println("Main method");
		
		InstanceVariable iv = new InstanceVariable();
		
		iv.tAmount();
	}
	
	public void tAmount()
	{
		InstanceVariable iv = new InstanceVariable();
		System.out.println("The Transfer amount is : "+ iv.amount);
		System.out.println("The Char is : "+ iv.ch);
	}
}