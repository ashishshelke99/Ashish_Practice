package com.ashish.practice.programs;

public class StringVowels {

	public static void main(String[] args) {
		
		String str = "Software Developer";
		
		str = str.toLowerCase();
		
		int vowelCount = 0;
		
		int consonantCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowelCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				consonantCount++;
			}
			
		}
		System.out.println("No of vowels in "+str+" :  " +vowelCount);
		
		System.out.println("No of consonants in "+str+" :  " +consonantCount);
		
		
		
		
		
		
	}

}