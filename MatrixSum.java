//package com.pack1;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		int a[][] = {{1,2,0},{5,6,7}};
		int b[][] = {{2,4,6},{4,1,2}};
		int c[][] = new int[2][3];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
			}

}
