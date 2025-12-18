package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("This is my pen", "i want to leave delhi",
				"Because in delhi there are very pollution");
		List<String> collect = asList.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")))
				.collect(Collectors.toList());
		System.out.println(collect);

		List<String> collect2 = collect.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2); // delhi is removed because of distinct()
	}
}
