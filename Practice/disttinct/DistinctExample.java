package com.rahul.disttinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Vivo", "laptop", "Iphone", "Samsung", "Oppo", "Oppo");
		List<String> distinctElement = list.stream().distinct().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println("Elements : "+list);
		System.out.println("Element length > 5 : "+distinctElement);
	}

}
