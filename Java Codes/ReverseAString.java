//package com.pack1;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "akesh";
		String reverse = " ";
		for(int i=str.length()-1; i>=0;i--) {
			 reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
