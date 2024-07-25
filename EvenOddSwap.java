package com.pack1;

public class EvenOddSwap {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("before swap a = "+ a +" and b = "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after swap a = "+ a +" and b = "+b);
		
		if((a & 1)==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(b+" is odd");
		}
		if((b & 1)==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(b+" is odd");
		}
	}

}
