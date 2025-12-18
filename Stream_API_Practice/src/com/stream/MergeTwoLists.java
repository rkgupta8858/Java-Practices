package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

		List<Integer> list3 = Stream.concat(list.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println(list3);
	
	}
}
