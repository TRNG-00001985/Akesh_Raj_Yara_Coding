package demo1;

public class ExceptionCode1 {
    public static void main(String[] args) {
        try {
			int i = 1/0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
    }
}
