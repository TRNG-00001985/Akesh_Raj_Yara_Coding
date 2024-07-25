package com.pack1;

import java.util.Scanner;

public class HardCodedLogin {

	public static void main(String[] args) {
		String username = "akesh123";
		String pswd = "akesh@123";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username : ");
		String givenusername = sc.next();
		System.out.print("Enter Password : ");
		String givenpswd = sc.next();
		if(username.equals(givenusername)&&pswd.equals(givenpswd)) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login Failed");
		}
		sc.close();
	}

}
