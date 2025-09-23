package com.rahul.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Samsung");
		list.add("Moto");
		list.add("Sansui");
		list.add("Sony");
		list.add("Apple");
		list.add("Lg");
		System.out.println(list);
		
		Stream<String> stream = list.stream();
		Stream<String> filteredStream = stream.filter(a->a.startsWith("S")).map(b->b.toUpperCase());
		List<String> outPutList = filteredStream.collect(Collectors.toList());
		System.out.println(outPutList);
		
		
	}

}
