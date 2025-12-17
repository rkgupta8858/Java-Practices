package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyEvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 6, 4, 1, 2, 3, 8, 4, 9, 1, 2, 7, 1);

		System.out.println("Numbers : "+list);
		
		List<Integer> collect = list.stream().filter(n -> n % 2 == 0).map(n -> n * 10).collect(Collectors.toList());

		System.out.println("Sum Number * 10 :"+collect);
	}
}
