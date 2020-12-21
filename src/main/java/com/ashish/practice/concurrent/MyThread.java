package com.ashish.practice.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread {

	//static ArrayList l = new ArrayList();
	
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public void run() {
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
		l.add("D");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		l.add("A");
		l.add("B");
		l.add("C");
		
		MyThread t = new MyThread();
		t.start();
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println("Main thread iterating list and current obj is: " + s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}

}
