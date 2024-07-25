package com.pack1;

public class HexatoOct {

	public static void main(String[] args) {
		String hex = "2b2ef";
		Integer i = Integer.valueOf(hex,16);
		String str = Integer.toOctalString(i); 
		System.out.println(str);
		
	}

}
