package com.ashish.practice.multithreading2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = new ArrayList<>();
		
		tasks.add(new CallableTask("Amazon"));
		tasks.add(new CallableTask("Google"));
		tasks.add(new CallableTask("Facebook"));
		
		List<Future<String>> list = executorService.invokeAll(tasks);
		
		for (Future<String> future : list) {
			System.out.println(future.get());
		}
		
		executorService.shutdown();
	}

}
