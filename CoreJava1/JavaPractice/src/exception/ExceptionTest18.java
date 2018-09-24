package exception;

public class ExceptionTest18 {
	static int div(int n, int d) {
		int r = 0;
		try {
			return n / d;
		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
		}
		return r;
	}

	public static void main(String[] args) {
		int res = 0;
		res = div(10, 2);
		System.out.println(res);
		res = div(10, 0);
		System.out.println(res);

	}

}
