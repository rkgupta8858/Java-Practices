package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User {
	private String name;
	private List<String> number;
	
	public User(String name, List<String> number) {
		this.name=name;
		this.number=number;
	}
	public List<String> getNumber() {
		return number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"->"+this.number;
	}
}

public class UserExample {

	public static void main(String[] args) {

		List<User> list = Arrays.asList(new User("Rahul", Arrays.asList("8922082335","8787087214")),new User("Rohit", Arrays.asList("7275740072")));
		System.out.println(list);
		
		List<List<String>> num = 	list.stream().map(n->n.getNumber()).collect(Collectors.toList());
		System.out.println(num);
	}

}
