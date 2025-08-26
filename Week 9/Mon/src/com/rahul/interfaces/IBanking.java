package com.rahul.interfaces;

public interface IBanking extends IRbi {
	public static final int MAX = 100;
	int MIN = 10;
	abstract void pay();
	public abstract void settle();
	void cancelChque();
	void stopPayment();
	void doRTGSTPayment(boolean flag);
	public default void applKcc() {
		
	}
	
	public static void printPassBook()
	{
		System.out.println("IBanking.printPassBook()");
	}
}
