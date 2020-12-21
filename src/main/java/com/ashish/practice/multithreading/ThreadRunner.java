package com.ashish.practice.multithreading;

class ThreadA extends Thread {
	
	public void run() {
		System.out.println("Thread A started");
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Thread A done");

	}
}

class ThreadB extends Thread {
	
	public void run() {
		System.out.println("Thread B started");
		for(int i=101; i<=200; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Thread B done");

	}
}

class ThreadC extends Thread {
	
	public void run() {
		System.out.println("Thread C started");
		for(int i=201; i<=300; i++) {
			System.out.print(i+" ");
		}
	}
}

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadA t1 = new ThreadA();
		t1.start();
		
		ThreadB t2 = new ThreadB();
		t2.start();
		
		t1.join();
		t2.join();
		
		ThreadC t3 = new ThreadC();
		t3.start();
		
	}

}
