package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s1 = "Hello My name is rahul kumar gupta";
		String str = Arrays.stream(s1.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(str);

		List<String> collect = Arrays.stream(s1.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect);

	}
}
