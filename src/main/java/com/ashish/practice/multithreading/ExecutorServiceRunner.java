package com.ashish.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ExecutorServiceRunner {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		
		executorService.execute(new ThreadA());
		executorService.execute(new ThreadB());
		executorService.execute(new ThreadC());
		
		executorService.shutdown();
		
	}

}
