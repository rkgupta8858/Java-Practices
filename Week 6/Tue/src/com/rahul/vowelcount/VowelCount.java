package com.rahul.vowelcount;

public class VowelCount {

	public static void main(String[] args) {
		String s = "RAhul";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
				System.out.print(ch[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println(count);

	}

}

