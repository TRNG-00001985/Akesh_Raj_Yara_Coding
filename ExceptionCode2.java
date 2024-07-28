package demo1;

import java.lang.ArithmeticException;


public class ExceptionCode2 {
	
	public static void checkAge(int age) {
		if(age<18)
			throw new ArithmeticException("less than 18 are not allowed to vote");
		else
			System.out.println("you are welcome! to vote");
	}
	
	public static void main(String[] args) {
		try {
			checkAge(10);
		} catch (ArithmeticException e) {
			System.out.println("Exception :"+e.getMessage());
		}
	}
}
