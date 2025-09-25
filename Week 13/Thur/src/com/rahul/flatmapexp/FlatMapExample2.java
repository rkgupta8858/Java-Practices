package com.rahul.flatmapexp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {
	public static void main(String[] args) {
		List<List<String>> product = Arrays.asList(Arrays.asList("Rahul", "Rohit", "IPhone"),
				Arrays.asList("LAptop", "TRimmer", "Airpods"), Arrays.asList("KTm", "Appache", "bullet"));
		System.out.println(product);

		List<String> filteredProduct = product.stream().flatMap(p -> p.stream()).filter(l -> l.length() > 5)
				.collect(Collectors.toList());
		System.out.println(filteredProduct);
	}
}
