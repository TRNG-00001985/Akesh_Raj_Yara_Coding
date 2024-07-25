package com.pack1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, temp;
		System.out.println(a);
		System.out.println(b);
		for(int i = 3; i<=10; i++) {
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}
	}
}
