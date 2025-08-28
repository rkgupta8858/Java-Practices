package com.rahul.interone;

public class Driver {

	public static void main(String[] args) {
		IAadharAuthentication csc = new CSCCenter();
		csc.register();
		csc.approve();
		csc.suspend();
		csc.changeMobileNumber();
		csc.changeAddress();
		
		System.out.println("--------------------------------------------------");
		
		IAadharAuthentication eseva = new ESeva();
		eseva.register();
		eseva.approve();
		eseva.suspend();
		csc.changeMobileNumber();
		eseva.changeAddress();
		System.out.println("--------------------------------------------------");
		
		IAadharAuthentication emitra = new EMitra();
		emitra.register();
		emitra.approve();
		emitra.suspend();
		emitra.changeMobileNumber();
		csc.changeAddress();
		System.out.println("--------------------------------------------------");
		
		IAadharAuthentication bangloreone = new BangaloreOne();
		bangloreone.register();
		bangloreone.approve();
		bangloreone.suspend();
		emitra.changeMobileNumber();
		csc.changeAddress();
		System.out.println("--------------------------------------------------");
		
		IAadharAuthentication bank = new Banks();
		bank.changeMobileNumber();
		System.out.println("--------------------------------------------------");
		
		IAadharAuthentication postoffice = new PostOffice();
		postoffice.changeAddress();
		
		
		
		

	}

}
