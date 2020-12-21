package com.ashish.practice.programs;

public class DuplicateChars {

	public static void main(String[] args) {
		
		String str = "Champions League";
		
		str = str.toLowerCase();
		
		char[] chArray = str.toCharArray();
		
		int count = 0;
		
		System.out.println("Duplicate chars in string are: ");
		
		for(int i=0; i<chArray.length; i++) {
			count=1;
			for(int j=i+1; j<chArray.length; j++) {
				if(chArray[i] == chArray[j]) {
					count++;
					chArray[j] = '0';
				}
			}
			if(count>1 && chArray[i] != '0') {
				System.out.println(chArray[i]);
			}
		}
		
	}

}
