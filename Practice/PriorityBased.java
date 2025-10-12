// Create three Class and assign different priorities (min, norm, max).

package com.rahul.thread2;

class MinimumPriority extends Thread {
	@Override
	public void run() {
		int minPriority = Thread.MIN_PRIORITY;
		System.out.println("Minimum Prioerity : "+minPriority);
	}
}

class MaximumPriority extends Thread {
	@Override
	public void run() {
		int maxPriority = Thread.MAX_PRIORITY;
		System.out.println("Maximum Prioerity : "+maxPriority);
	}
}

class NormalPriority extends Thread {
	@Override
	public void run() {
		int normPriority = Thread.NORM_PRIORITY;
		System.out.println("Normal Prioerity : "+normPriority);
	}
}

public class PriorityBased {

	public static void main(String[] args) {

		MinimumPriority t1 = new MinimumPriority();
		t1.start();
		MaximumPriority t2 = new MaximumPriority();
		t2.start();
		NormalPriority t3 = new NormalPriority();
		t3.start();

	}

}
