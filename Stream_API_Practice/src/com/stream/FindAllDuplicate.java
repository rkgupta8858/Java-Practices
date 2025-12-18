package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 8, 6, 9, 7, 8, 52, 4, 5, 2);
		List<Integer> list2 = list.stream().filter(n -> Collections.frequency(list, n) > 1)
				.collect(Collectors.toList());
		System.out.println(list2);
	}
}
