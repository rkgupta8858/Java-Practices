package com.rahul.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("India", "New Delhi");
		map.put("Nepal", "Kathmandu");
		map.put("Srilanka", "Colombo");
		map.put("USA", "Washington");
		map.put("Israil", "Jerusalem");
		map.put("Russia", "Moscow");
		map.put("China", "Beijing");
		map.put("Pak", null);
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsValue("New Delhi"));
		
		map.replace("China", "beijing");
		System.out.println(map);
		
		map.replaceAll((k,v) -> v==null ? "Default" : v.toLowerCase());
		System.out.println(map);
	}
}
