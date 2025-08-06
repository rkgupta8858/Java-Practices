package com.rahul.oops.word;
public class WordCount {
	public static void main(String[] args) {
		String str = "abc efg, ijk  ";
		str = str.trim();
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ')  {
				if (str.charAt(i+1)==' ') {
					continue;
				}
				if(str.charAt(i+1)=='.' || str.charAt(i)==',') {
					count--;
				}
				count++;
			}	
		}
		System.out.println(++count);
	}
}
