package com.rahul.reentrant;

import java.util.concurrent.locks.ReentrantLock;

class AccountMgnt {
	ReentrantLock reentrantLock = new ReentrantLock();

	public void employee() {
		System.out.println("Thread is : " + Thread.currentThread().getName());

		System.out.println("********************************************");
		reentrantLock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("salary is : " + (i * 100) + " and Thread is : " + Thread.currentThread().getName());
		}
		
		reentrantLock.unlock();
		System.out.println("********************************************");
	}
}

class Reentrant extends Thread {

	AccountMgnt accountMgnt;

	@Override
	public void run() {
		accountMgnt.employee();
	}

	public Reentrant(AccountMgnt accountMgnt) {
		this.accountMgnt = accountMgnt;
	}

}

public class ReEntrantLockExample {

	public static void main(String[] args) {
		AccountMgnt accountMgnt = new AccountMgnt();
		Reentrant reentrant = new Reentrant(accountMgnt);
		Reentrant reentrant1 = new Reentrant(accountMgnt);
		Reentrant reentrant2 = new Reentrant(accountMgnt);

		reentrant.start();
		reentrant1.start();
		reentrant2.start();
		
		
	}

}
