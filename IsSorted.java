package com.pack1;

public class IsSorted {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int arr1[] = {6,5,4,3,2,1};
		System.out.println("array sorted in ascending order "+isSortedasc(arr));
		System.out.println("array sorted in descending order "+isSorteddsc(arr1));
	}
	public static boolean isSortedasc(int arr[]) {
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < arr[i-1])
				return false;
		}
		return true;
	}
	public static boolean isSorteddsc(int arr1[]) {
		for(int i = 1; i<arr1.length; i++) {
			if(arr1[i] > arr1[i-1])
				return false;
		}
		return true;
	}
}
