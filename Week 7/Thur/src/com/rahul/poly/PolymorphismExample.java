package com.rahul.poly;

class Person
{
	void showRole() {
		System.out.println("I am a Person with multiple role !!");
	}
}

class Student extends Person
{
	void showRole() {
		System.out.println("I am a Student. I study and attend class !!");
	}
}

class Brother extends Person
{
	void showRole() {
		System.out.println("I am a Brother. I spend time with my cousins !!");
	}
}



public class PolymorphismExample {

	public static void main(String[] args) {
		Person person;
		person = new Student();
		person.showRole();
		
		person= new Brother();
		person.showRole();

	}

}











