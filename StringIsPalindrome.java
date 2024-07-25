package com.pack1;

public class StringIsPalindrome {

	public static void main(String[] args) {
		String str = "mom";
		String palindrome = "";
		for(int i = str.length()-1; i >= 0; i--) {
			palindrome += str.charAt(i);
		}
		if(str.equals(palindrome))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}

}
