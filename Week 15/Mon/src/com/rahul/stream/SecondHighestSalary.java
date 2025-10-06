package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(231000, 34354, 1000, 43563, 689879);
		System.out.println(list);

		List<Integer> sortedElement = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println("Sorted Element In reverse Order :"+sortedElement);
		
		// sorted(Comparator.reverseOrder()) --> I can use

		Integer secondHighest = sortedElement.stream().skip(1).findFirst().get();
		System.out.println("Ssecond Highest Salary is : "+secondHighest);

	}

}
