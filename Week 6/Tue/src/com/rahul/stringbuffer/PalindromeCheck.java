package com.rahul.stringbuffer;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "madam";
		boolean b = true;
		for (int i = 0; i <= str.length()-1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				b=false;
				break;
			}
			
		}
		if (b) {
			System.out.println("it is Palindrome !!");
		}
		else {
			System.out.println("It is not palindrome !!");
		}

	}

}
