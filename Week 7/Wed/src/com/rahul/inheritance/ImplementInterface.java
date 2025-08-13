package com.rahul.inheritance;

interface Account{
	default void showBalance() {
		System.out.println("Account balance !!");
	}
}
interface SavingAccount{
	default void showBalance() {
		System.out.println("Saving Account balance !!");
	}
}

class PremiumAccount implements Account, SavingAccount
{
	public void showBalance() {
		System.out.println("Premium Account Resolving Conflict !!");
	}
}

public class ImplementInterface {
	public static void main(String[] args) {
		PremiumAccount pa = new PremiumAccount();
		pa.showBalance();
	}
}
