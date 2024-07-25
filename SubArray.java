package com.pack1;

public class SubArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int indexStart = 2;
		int indexEnd = 6;
		if(indexStart<0 || indexEnd>=arr.length || indexStart>indexEnd ) {
			System.out.println("invalid indexes");
		}
		
		for(int i = indexStart; i<indexEnd; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}


