package com.ashish.practice.misc2;

public class Armstrong {

	public static void main(String[] args) {
		
		int c=0, r, temp;
		
		int n = 153;
		
		temp = n;
		
		while(n > 0) {
			r = n % 10;
			n = n/10;
			c = c + (r*r*r);
		}
		
		if(temp == c) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("No Armstrong");
		}
		
	}

}
