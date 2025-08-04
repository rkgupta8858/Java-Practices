package com.rahul.rk;

public class StringSplit {

	public static void main(String[] args) {
		String str = "Hello i am from bengaluru karnataka";
		String[] strArr = str.split(" ");
		System.out.println(strArr.length);
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + ",");
		}
		System.out.println();
		
		
		String str1 = "Hello&i&am&from&bengaluru&karnataka2	";
		String[] strArr1 = str1.split("&");
		System.out.println(strArr1.length);		
		for (int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i] + ",");
		}
		
	}

}
