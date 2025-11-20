package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rahul", "Rohit", "Ravi", "Aanand", "Ashwani");
		System.out.println(list);

		List<Integer> lengthFind = list.stream().map(n -> n.length()).collect(Collectors.toList());
		System.out.println(lengthFind);

	}

}
