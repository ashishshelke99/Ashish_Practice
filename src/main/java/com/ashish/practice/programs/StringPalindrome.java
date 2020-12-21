package com.ashish.practice.programs;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        String inputStr = s.nextLine();
        inputStr = inputStr.toLowerCase();
        String reverseString = "";
        
        //char[] charArr = inputStr.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for (int i = inputStr.length() - 1; i >= 0; i--) {
			sb.append(inputStr.charAt(i));
		}
        String reverseStr2 = sb.toString();
        
        if (inputStr.equals(reverseStr2)) {
			System.out.println("YES");
		}
        else {
        	System.out.println("NO");
        }

	}

}
