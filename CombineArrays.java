package com.pack1;

import java.util.Arrays;

public class CombineArrays {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		int a1 = arr1.length;
		int a2 = arr2.length;
		
		int sum = a1 + a2;
		int result[] = new int[sum];
		//Using arraycopy predefined method
		System.arraycopy(arr1, 0, result, 0, a1);
		System.arraycopy(arr2, 0, result, a1, a2);
		System.out.println(Arrays.toString(result));
	}
}
