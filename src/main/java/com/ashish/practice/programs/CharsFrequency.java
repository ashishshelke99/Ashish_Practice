package com.ashish.practice.programs;

public class CharsFrequency {

	public static void main(String[] args) {
		
		String str = "aabbccc";
		
		int[] freq = new int[str.length()];
		
		char[] chArray = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			freq[i] = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(chArray[i] == chArray[j]) {
					freq[i]++;
					chArray[j] = '0';
				}
			}
		}
		
		for(int i=0; i<freq.length; i++) {
			if(chArray[i] != ' ' && chArray[i] != '0') {
				System.out.println(chArray[i] + " -> " + freq[i]);
			}
		}
		
		
	}

}
