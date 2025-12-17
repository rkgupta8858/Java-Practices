package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 6, 4, 1, 2, 3, 8, 4, 9, 1, 2, 7, 1);

		System.out.println("Unsorted Numbers : " + list);

		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted elements  : " + sorted);

	}
}
