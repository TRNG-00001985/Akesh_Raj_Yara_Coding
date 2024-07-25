package com.pack1;

import java.util.Arrays;

public class ArraysAreEqual {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		int arr3[] = {2,4,5,7,8};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr3));
		System.out.println(Arrays.equals(arr3, arr1));
	}

}
