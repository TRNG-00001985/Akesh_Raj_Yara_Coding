package com.pack1;

public class ContainsAndDoesnotContains {

	public static void main(String[] args) {
		String str = "java batch revature";
		
		System.out.println("Contains :");
		System.out.println(str.contains("revature"));
		System.out.println(str.contains("hello"));
		
		System.out.println("Does not Contains :");
		System.out.println(!str.contains("java"));
		System.out.println(!str.contains("world"));
	}

}
