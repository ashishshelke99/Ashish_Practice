package com.ashish.practice.collection;

import java.util.TreeSet;

public class Run2 {
	
	

	public static void main(String[] args) {

		  TreeSet<String> set = new TreeSet<String>();
		  
		  set.add("ashish");
		  set.add("zac");
		  set.add("sam");
		  
		  System.out.println(set);
		  
		  System.out.println(set.higher("ashish"));
		  
	}

}