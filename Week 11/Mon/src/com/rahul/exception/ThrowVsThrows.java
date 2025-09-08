package com.rahul.exception;

public class ThrowVsThrows {

	public static void main(String[] args) {
		
		ThrowVsThrows throws1 = new ThrowVsThrows();
		try {
			throws1.pay("Rahul", 500, 1000);
		} catch (InsufficientBalanceException e) {
			System.out.println("You can not transfer : Insufficient Balance !!");
			e.printStackTrace();
		}
		

	}
	public void pay(String name, int balance, int transferBalance) {
		if (balance < transferBalance) {
			throw new InsufficientBalanceException("Insufficient balance : You can not Transfer !!");
		}
		else {
			System.out.println("Amount "+transferBalance +" Transfered Successful !!");
			System.out.println("New Balance : "+(balance-transferBalance));
		}
	}

}
