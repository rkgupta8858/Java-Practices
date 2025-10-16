package com.rahul.reentrant1;

import java.util.concurrent.locks.ReentrantLock;

public class Withdraw {
	int total_balance = 1000;

	// Using Synchronized method

//	public synchronized void withdrawBalance(int balance) {
//		if (total_balance >= balance) {
//			System.out.println(balance + " Amount is Transfered !!");
//			total_balance = total_balance - balance;
//			System.out.println("Remaining Balance : " + total_balance);
//		} else {
//			System.err.println("Insufficient Balance !!");
//		}
//	}

// *************************************************************************

	// Using Synchronized method
//	public void withdrawBalance(int balance) {
//		synchronized (this) {
//
//			if (total_balance >= balance) {
//				System.out.println(balance + " Amount is Transfered !!");
//				total_balance = total_balance - balance;
//				System.out.println("Remaining Balance : " + total_balance);
//			} else {
//				System.err.println("Insufficient Balance !!");
//			}
//		}
//	}

// *************************************************************************

	// Using reentrant
	ReentrantLock reentrantLock = new ReentrantLock();
	public void withdrawBalance(int balance) {
		
		reentrantLock.lock();

		if (total_balance >= balance) {
			System.out.println(balance + " Amount is Transfered !!");
			total_balance = total_balance - balance;
			System.out.println("Remaining Balance : " + total_balance);
		} else {
			System.err.println("Insufficient Balance !!");
		}

		reentrantLock.unlock();
	}

}
