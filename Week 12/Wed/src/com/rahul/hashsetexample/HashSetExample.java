package com.rahul.hashsetexample;

import java.util.HashSet;


class Product{
	String name;
	
	public Product(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name.toString();
	}
}

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Product> hashSet = new HashSet<Product>();
		hashSet.add(new Product("Rahul"));

		System.out.println(hashSet);
	}

}
