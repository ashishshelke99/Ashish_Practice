package com.ashish.practice.oops;

public class Child extends Parent {
	
	int x = 20;
	
	public void m1() {
		System.out.println("In Child m1()");
	}

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.m1();
		
		
		
		System.out.println(p.x);
		
	}

}
