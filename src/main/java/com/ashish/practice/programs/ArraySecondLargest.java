package com.ashish.practice.programs;

import java.util.Arrays;

public class ArraySecondLargest {

	public static int secondLargestElement(int[] arr, int length) {
		
		int temp = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		Arrays.sort(arr);
		
			return arr[length - 2];
	}
	
	public static void main(String[] args) {
		
		int[] arr = {34,78,45,99,74,23};
		
		
		System.out.println("2nd largest element is: " + secondLargestElement(arr, arr.length));
		
	}

	

}
