package com.rahul.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestWord {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ravi", "Rohan", "Abhishek", "Aanand");
		System.out.println(list);

		String longest = list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(longest);
		
		String shortest = list.stream().min(Comparator.comparingInt(String::length)).get();
		System.out.println(shortest);

	}

}
