package com.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {

	public static void main(String[] args) {
		String input = "banana";
		Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(collect);
	}

}
