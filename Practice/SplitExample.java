package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello I am Rahul", "I am from Gorakhpur",
				"I completed B.Tech From VBSPU Jaunpr");
		System.out.println(list);

		List<String> sen = list.stream().flatMap(sentance -> Arrays.stream(sentance.split(" ")))
				.collect(Collectors.toList());
		System.out.println(sen);
	}

}
