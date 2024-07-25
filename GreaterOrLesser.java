package com.pack1;

public class GreaterOrLesser {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int greater = a;
		if(b > greater) {
			greater = b;
		}
		if(c > greater) {
			greater = c;
		}
		int least = a;
		if(b < least) {
			least = b;
		}
		if(c < least) {
			least = c;
		}
		System.out.println("greatest of 3 numbers is :"+greater);
		System.out.println("least of 3 numbers is :"+least);
	}

}
