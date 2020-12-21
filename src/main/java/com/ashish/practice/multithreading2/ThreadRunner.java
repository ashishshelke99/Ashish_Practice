package com.ashish.practice.multithreading2;

class TaskA extends Thread {
	
	public void run() {
		
		System.out.println("TaskA started");
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n TaskA Done");
	}
	
	
}

class TaskB extends Thread {
	
	
	
	public void run() {
		
		System.out.println("TaskB started");
		
		for(int i=101; i<=200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n TaskB Done");
	}
	
	
}

class TaskC extends Thread {
	
	
	public void run() {
		
		System.out.println("TaskC started");
		
		for(int i=201; i<=300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n TaskC Done");
	}
	
	
	
	
}

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {

		TaskA t1 = new TaskA();
		t1.start();
		
		TaskB t2 = new TaskB();
		t2.start();
		
		t1.join();
		t2.join();
		
		TaskC t3 = new TaskC();
		t3.start();
		
		
		
	}

}
