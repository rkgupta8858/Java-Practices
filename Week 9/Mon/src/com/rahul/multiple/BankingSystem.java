package com.rahul.multiple;

public class BankingSystem implements BankService, LoneService {

	@Override
	public void applyLone() {
		System.out.println("Lone Approved !!");
		
	}

	@Override
	public void deposite() {
		System.out.println("Deposited Sucessful !!");
		
	}

}
