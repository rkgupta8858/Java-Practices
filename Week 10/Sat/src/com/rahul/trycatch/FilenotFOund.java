package com.rahul.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFOund {
	public static void main(String[] args) {
		FileReader fileReader = new FileReader("file.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String data = null;
		
		while ((data=bufferedReader.readLine())!=null) {
		
			System.out.println(data);
		}
		bufferedReader.close();
	}
}
