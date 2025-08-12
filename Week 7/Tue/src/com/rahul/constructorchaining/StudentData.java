package com.rahul.constructorchaining;

class StudentDetails
{

	public StudentDetails(String name) {
		System.out.println("Rahul kumar Gupta");
	}
	
}

class Student extends StudentDetails
{
	public Student(int id, String name) {
		super(name);
		System.out.println(id+" "+name);
	}
	
}


public class StudentData {

	public static void main(String[] args) {
		Student student = new Student(101,"Rahul");

	}

}
