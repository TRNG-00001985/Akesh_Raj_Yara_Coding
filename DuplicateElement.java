package com.pack1;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,8,4,5,6,8};
		System.out.print("Duplicates in the given array are: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[j]+" ");
			}
		}
	}

}
