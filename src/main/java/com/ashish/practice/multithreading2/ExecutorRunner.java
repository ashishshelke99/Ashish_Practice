package com.ashish.practice.multithreading2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunner {

	public static void main(String[] args) {

		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		executorService.execute(new TaskA());
		executorService.execute(new TaskB());
		executorService.execute(new TaskC());
		
		executorService.shutdown();
		
	}

}
