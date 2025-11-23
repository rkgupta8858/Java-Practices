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
		HashSet<String> hashSet1 = new HashSet<String>(64);
		HashSet<Product> hashSet = new HashSet<Product>(21);
		hashSet.add(new Product("Rahul"));
//		int size = hashSet.size();

		System.out.println(hashSet1.size());
		System.out.println(hashSet1);
	}

}
