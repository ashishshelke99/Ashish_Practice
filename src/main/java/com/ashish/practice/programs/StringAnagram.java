package com.ashish.practice.programs;

import java.util.Arrays;

public class StringAnagram {

	public static boolean isAnagram(String s1, String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2) == true) {
				return true;
			}
			else {
				return false;
			}
			
		}		
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "Grab";
		String s2 = "Brag";
		
		System.out.println(isAnagram(s1, s2));
		
		
		
	}

	

}
