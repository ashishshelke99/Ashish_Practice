package com.ashish.practice.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task extends Thread {

	//static ArrayList<Integer> al = new ArrayList<Integer>();
	
	static CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<Integer>();
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
		al.add(4);
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		Task t = new Task();
		t.start();
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(1000);
		}
		
		System.out.println(al);
			
			
	}

}
