package com.rahul.trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Driver d = new Driver();
		d.readFiles();
		
	}
	public void readFiles() throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(""))){
			String line = br.readLine();
		    System.out.println(" reading file");
		}
		catch(Exception e){
			System.out.println("File not found !!");
		}
		
	}

}
