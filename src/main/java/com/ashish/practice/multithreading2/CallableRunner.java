package com.ashish.practice.multithreading2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;
	
	
	
	public CallableTask(String name) {
		super();
		this.name = name;
	}



	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Hello " + this.name;
	}
	
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		Future<String> futureMsg = executorService.submit(new CallableTask("Amazon"));
		
		System.out.println(futureMsg.get());
		
		executorService.shutdown();
		
	}

}
