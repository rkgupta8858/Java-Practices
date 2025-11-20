package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenExample {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(5, 4, 8, 7, 6), Arrays.asList(5, 56, 88, 70, 6),
				Arrays.asList(54, 45, 8, 7, 68));
		System.out.println(list);
		List<Integer> num = list.stream().flatMap(n -> n.stream()).collect(Collectors.toList());

		System.out.println(num);
		List<Integer> num1 = num.stream().distinct().collect(Collectors.toList());
		System.out.println(num1);
	}

}
