package com.ashish.practice.proxydesign;

public class ProxyImage implements Image {
	
	private RealImage realImage;
	
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
	
	

}
