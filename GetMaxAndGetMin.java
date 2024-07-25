package com.pack1;

public class GetMaxAndGetMin {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,15};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Max number in array is : "+max);
		System.out.println("Min number in array is : "+min);
	}

}
