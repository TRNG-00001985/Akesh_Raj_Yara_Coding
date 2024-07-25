package com.pack1;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 9034;
		int temp = num,sum = 0,rem = 0;
		while(temp != 0) {
			rem = temp%10;
			sum += rem;
			temp = temp/10;
		}
		System.out.println(sum);
	}

}
