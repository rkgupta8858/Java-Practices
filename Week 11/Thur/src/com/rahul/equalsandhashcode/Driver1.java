package com.rahul.equalsandhashcode;

class Person1{
	private String name;
	public Person1(String name) {
		this.name=name;
	}
	
	public boolean equals(Object obj) {
		Person1 person1 = (Person1) obj;
		return this.name.equals(person1.name);
	}
	public int hashCode() {
		return this.name.hashCode();
	}
//	
}

public class Driver1 {

	public static void main(String[] args) {
		Person1 person1 = new Person1("Rahul");
		Person1 person2 = new Person1("Rahul");
		System.out.println(person1.equals(person2));
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

	}

}
