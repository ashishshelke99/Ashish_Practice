package com.ashish.practice.oops;

//static control flow

public class Base {
	
	static int i = 10;
	
	static {
		m1();
		System.out.println("First Static block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		System.out.println("main method");
		
	}
	
	public static void m1() {
		System.out.println(j);
	}
	
	static {
		System.out.println("Second Static block");
	}
	static int j = 20;

}
