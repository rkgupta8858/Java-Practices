package com.rahul.banking;

public interface IBanking {
	public static final double BALANCE=1000;
	
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	public abstract double checkBalance();
}
