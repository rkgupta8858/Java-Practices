package com.rahul.rk;


class Test{
	public void demo()
	{
		System.out.println("This is Demo Class !!");
	}
}


public class ObjectCreation extends Test{

	public void demo()
	{
		System.out.println("This is Object Creation Class !!");
	}
	
	public static void main(String[] args) {
		ObjectCreation objectCreation = new ObjectCreation();
		objectCreation.demo();
		
		Test test = new ObjectCreation();
		test.demo(); 
		
		ObjectCreation oc = (ObjectCreation) new Test();
		oc.demo();
		
		

	}

}
