package com.rahul.rk;

public class UniqueCharacterFind {

	public static void main(String[] args) {
		String str = "kodewala";
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
	
				}	
			}
			if(count==1) {
				System.out.print(ch[i]+" ");
			}
		}

	}

}
