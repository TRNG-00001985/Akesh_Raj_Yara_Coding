package com.pack1;

public class MaxMinusMin {

	public static void main(String[] args) {
		int arr[] = {12,29,17,13,15,28,8};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		int result = max - min;
		System.out.println("Max number in array is : "+max);
		System.out.println("Min number in array is : "+min);
		System.out.println("difference b/w max and min vlaues : "+result);
		
	}

}
