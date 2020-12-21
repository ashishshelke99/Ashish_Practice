package com.ashish.practice.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskA implements Callable<String> {

	private String name;
	
	public TaskA(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
	
	
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		 Future<String> msg = executorService.submit(new TaskA("Ashish"));
		
		 System.out.println(msg.get());
		 
		 executorService.shutdown();
		
	}

}
