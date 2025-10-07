package com.rahul.duplicate;

// Find first Non repeating character 

public class FIndFirstDuplicateChar {

	public static void main(String[] args) {
		String str = "Anoopam";
		System.out.println(str);
		Character chara = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c))
				.findFirst().orElseThrow();
		System.out.println(chara);

	}

}
