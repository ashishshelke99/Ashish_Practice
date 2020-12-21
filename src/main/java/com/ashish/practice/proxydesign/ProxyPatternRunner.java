package com.ashish.practice.proxydesign;

public class ProxyPatternRunner {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("image_10mb.jpg");
		
		image.display();
		System.out.println("");
		
		image.display();
		
	}

}
