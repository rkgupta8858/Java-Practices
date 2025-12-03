package com.rahul.multipleexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		try {
			String s = "nff";
			Integer.parseInt(s);
			FileInputStream fi = new FileInputStream(new File(""));
			
			
		} catch (IOException |NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

}
