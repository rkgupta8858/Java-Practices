package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Cat", "Elephant", "tiger", "Monkey");
		String string = list.stream().max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println(string);
	}
}
