package com.dataStructure;

import java.util.Arrays;

public class bubbleSort {
	
//	bubble sort algorithm
	public static void bubbleSort(int[] nums,int n) {
		
		boolean swapped;
		
		for(int i = 0;i<n-1;i++) {
			swapped = false;
			for(int j = 0;j<n-i-1;j++) {
				if(nums[j] > nums[j+1]) {
					
//					swapping adjacent elements
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}

	}
	
	//Print the array
	public static void print(int[] nums,int size) {
		
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
	
//	Main method
	public static void main(String[] args) {
		
		int nums[] = {4,2,1,5,7,5,3};
		int size  = nums.length;
		bubbleSort(nums,size);
		print(nums,size);
		
		
	}
}
