package com.rahul.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilenotFOund {
	public static void main(String[] args) {
		String file = "D:\\c to d\\Downloads\\raman biodata.docx";
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String data = null;
			
			while ((data=bufferedReader.readLine())!=null) {
			
				System.out.println(data);
			}
			bufferedReader.close();
			
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("File not found !!");
		}
		
	}
}
