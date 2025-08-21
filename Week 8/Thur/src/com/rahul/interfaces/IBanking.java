package com.rahul.interfaces;

public interface IBanking {
	public static final int MAX=100;
	int MIN=10;
	public abstract void pay();
	public abstract void settel();
	void cancleCheque();
	void stopPayment();
	void doRTGSPayment();
	int run(int a, int b);
	int run();
}
