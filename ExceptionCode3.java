//package demo1;
class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}

public class ExceptionCode3 {
	public static void checkAge(int age) throws CustomException {
		if(age<18)
		throw new CustomException("age lessthan 18 not allowed");
		else
			System.out.println("you are allowed");
	}

	public static void main(String[] args) {
			try {
				checkAge(15);
			} catch (CustomException e) {
				System.out.println("Exception :"+e.getMessage());
				//e.printStackTrace();
			}
	}

}
