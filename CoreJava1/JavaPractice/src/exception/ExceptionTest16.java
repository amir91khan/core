package exception;

public class ExceptionTest16 {

	public static void main(String[] args) {
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
			} catch (ArithmeticException e) {
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		} catch (NumberFormatException k) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch ");

	}

}
