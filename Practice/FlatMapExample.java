package com.rahul.flatmapexp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(5, 4, 85, 4, 5, 466, 4),
				Arrays.asList(7, 8, 8, 47, 4, 57, 8), Arrays.asList(9, 4, 58, 5, 4, 5, 84));
		System.out.println(list);
		
		List<Integer> number = list.stream().flatMap(n -> n.stream()).filter(num -> num % 2 != 0)
				.collect(Collectors.toList());
		System.out.println(number);
	}

}
