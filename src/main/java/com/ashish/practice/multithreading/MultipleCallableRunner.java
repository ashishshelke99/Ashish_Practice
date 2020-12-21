package com.ashish.practice.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;
	
	public CallableTask(String name) {
		
		this.name = name;
	}
	
	
	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		return "Hello " + name;
	}
	
	
	
}

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = new ArrayList<>();
		tasks.add(new CallableTask("Java"));
		tasks.add(new CallableTask("Python"));
		tasks.add(new CallableTask("ReactJS"));
		
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for (Future<String> result : results) {
			System.out.println(result.get());
		}
		
		executorService.shutdown();
	}

}
