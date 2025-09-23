package com.rahul.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Samsung");
		list.add("Moto");
		list.add("Sansui");
		list.add("Sony");
		list.add("Apple");
		list.add("Lg");
		System.out.println(list);

		List<String> stream = list.stream().filter(a -> a.startsWith("S")).collect(Collectors.toList());
		System.out.println(stream);

		List<String> list1 = new ArrayList<String>();
		list1.add("Samsung");
		list1.add("Moto");
		list1.add("Sansui");
		list1.add("Sony");
		list1.add("Apple");
		list1.add("Lg");
		System.out.println(list1);

		System.out.println(
				list1.stream().filter(a -> a.startsWith("S")).map(s -> s.toUpperCase()).collect(Collectors.toList()));

	}

}
