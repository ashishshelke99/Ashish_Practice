package com.ashish.practice.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductDeserialized {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("./resources/Prod1.ser");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Product productDecode = (Product) objectInputStream.readObject();
		
		System.out.println(productDecode.getProductId());
		System.out.println(productDecode.getProductName());
		System.out.println(productDecode.getProductPrice());
		
		
	}

}
