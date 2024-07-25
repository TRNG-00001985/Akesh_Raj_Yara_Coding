package com.pack1;

public class GcdCode {

	public static void main(String[] args) {
		int a = 12, b = 8;
		while(b!=0) {
			int rem = a % b;
			a = b;
			b = rem;
			while(rem==0)
				break;
		}
		System.out.println(a);
	}

}
