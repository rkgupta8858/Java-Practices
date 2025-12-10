package com.rahul.maxeven;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MaxEvenFind {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 10, 25, 6, 8, 6, 10, 10, 14);
		System.out.println(list);

		List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Number is : " + evenNumber);

		int max = evenNumber.stream().max((a, b) -> a - b).get();
		System.out.println("Max Element is : " + max);

		long count = evenNumber.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 1).count();
		System.out.println("Number more then one : "+count+" number ");
		
		Entry<Integer, Long> maxDuplicate = evenNumber.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().max(Map.Entry.comparingByValue()).orElseThrow();
		System.out.println("Number "+maxDuplicate +" time");
		
	}

}
