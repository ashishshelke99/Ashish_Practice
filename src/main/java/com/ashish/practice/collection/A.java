package com.ashish.practice.collection;

public class A {

	public void printStuff() {
		System.out.println("printstuff in A");
	}
	
	public static void main(String[] args) {
		
		A a = new B();
		a.printStuff();
	}

}

class B extends A {
	
	public void printStuff() {
		super.printStuff();
		System.out.println("printstuff in B");
	}
}
