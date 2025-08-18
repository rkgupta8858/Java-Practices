package com.rahul.poly1;

class Person{
	 Parent walking()
	{
		System.out.println("Person.walkign()");
		return null;
	}
	
}

// private < default < protected < public

class Ajay extends Person{
	Child walking()
	{
		System.out.println("Ajay.walkign()"); 
		return null;
	}
	
}

public class TestPoly {

	public static void main(String[] args) {
		
		Person p1 = new Ajay();
		p1.walking();
	}

}
