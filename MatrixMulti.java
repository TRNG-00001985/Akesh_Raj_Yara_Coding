package com.pack1;

public class MatrixMulti {

	public static void main(String[] args) {
		int a[][] = {{1,2,4,5},{3,5,6,7}};
		int mul = 1;
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(a[i][j]+" ");
				mul *= a[i][j];
			}System.out.println();
		}
		System.out.println("Multiplication Matrix is : "+mul);
	}

}
