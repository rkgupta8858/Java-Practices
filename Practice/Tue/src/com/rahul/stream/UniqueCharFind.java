package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharFind {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("rahul", "rohit", "ravi");
		System.out.println(list);

		List<Character> list2 = list.stream().flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
				.collect(Collectors.toList());
		System.out.println(list2);

		Set<Character> list3 = list2.stream().distinct().collect(Collectors.toSet());
		System.out.println(list3);
		
		
	}

}
