package com.ashish.practice.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapRunner extends Thread {

	//static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	
	static ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<Integer, String>();
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User Thread trying to update hashmap");
		hashMap.put(4, "sam");
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		hashMap.put(1, "ashish");
		hashMap.put(2, "mark");
		hashMap.put(3, "zac");
		
		HashMapRunner hmRunner = new HashMapRunner();
		hmRunner.start();
		
		Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			Thread.sleep(1000);
		}
		
		
	}

}
