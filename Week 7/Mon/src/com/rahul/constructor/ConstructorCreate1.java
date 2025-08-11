package com.rahul.constructor;

class Details {
	
	String name;
	int age;
	
	Details(){
		System.out.println("Default constructor Calling !!");
		name = "Unknown";
		age = 0;
	}
	
	Details(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println("Name is : "+name+ "\nAge is : "+age);
	}
}



public class ConstructorCreate1 {

	public static void main(String[] args) {
		Details details = new Details();
		Details details1 = new Details("rahul", 18);
		
		details.display();
		details1.display();
	}

}
