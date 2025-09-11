package com.rahul.equalsandhashcode;



class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return this.name.equals(person.name);
	}
	public int hashCode() {
		return this.name.hashCode();
	}
	
}


public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person("Rahul");
		Person p2 = new Person("Rahul");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
