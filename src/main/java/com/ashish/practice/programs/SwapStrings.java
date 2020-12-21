package com.ashish.practice.programs;

public class SwapStrings {

	public static void main(String[] args) {
		
		String str1 = "Java", str2 = "Python";
		
		System.out.println("Before swapping : " + str1 +" "+ str2 );
		
		str1 = str1 + str2; //JavaPython
		
		str2 = str1.substring(0, str1.length() - str2.length()); //Java
		
		str1 = str1.substring(str2.length()); //Python
		
		
		System.out.println("After swapping : " + str1 +" "+ str2 );
		
	}

}
