package com.rahul.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		ThreadPool[] pools = {new ThreadPool("Rahul"),
							  new ThreadPool("rohit"),
							  new ThreadPool("ravi"),
							  new ThreadPool("anand"),
							  new ThreadPool("aryan"),
							  new ThreadPool("rohan")};
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		for(ThreadPool pool : pools)
		{
			executorService.submit(pool);
		}
		executorService.shutdown();
			
	}

}
