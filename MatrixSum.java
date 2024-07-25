package com.pack1;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		/*int a[][] = {{1,2,3,4},{5,6,7,8}};
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(a[i][j]+" ");
				sum += a[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of Matrix is : "+sum);
		*/
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length; j++) {
			a[i][j] = sc.nextInt();
		 }
		}
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				System.out.print(a[i][j]+" ");
				sum += a[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of Matrix is : "+sum);
		sc.close();
	}

}
