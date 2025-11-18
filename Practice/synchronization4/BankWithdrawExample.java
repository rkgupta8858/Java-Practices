package com.rahul.synchronization4;

class BankWithdraw {
	int totalBalance = 1000;

	public synchronized void withdraw(int money) {
		if (totalBalance >= money) {
			System.out.println(money + " Withdraw Sucessfully !!");
			totalBalance = totalBalance - money;
			System.out.println("Available Balance : " + totalBalance);
		} else {
			System.err.println("Insufficient Balance !!");
		}
	}
}

class BankAccountThread extends Thread {
	BankWithdraw bankWithdraw;
	int money;

	public BankAccountThread(BankWithdraw bankWithdraw) {
		this.bankWithdraw = bankWithdraw;
	}

	@Override
	public void run() {
		bankWithdraw.withdraw(money);
	}

}

public class BankWithdrawExample {
	public static void main(String[] args) {
		BankWithdraw bankWithdraw = new BankWithdraw();
		BankAccountThread accountThread = new BankAccountThread(bankWithdraw);
		accountThread.money = 600;

		BankAccountThread accountThread1 = new BankAccountThread(bankWithdraw);
		accountThread1.money = 700;

		accountThread.start();
		accountThread1.start();
	}
}
