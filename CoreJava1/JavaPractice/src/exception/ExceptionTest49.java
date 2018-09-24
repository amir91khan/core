package exception;

class Division1 {

	static int div(String arg[]) {
		int res = -1;
		try {
			int a = Integer.parseInt(arg[0]);
			int b = Integer.parseInt(arg[1]);
			int c = a / b;
			res = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			res = 5;
		} catch (NumberFormatException k) {
			res = 6;
		} catch (ArithmeticException h) {
			res = 7;
		}
		System.out.println("after try/catch");
		return res;
	}

}

public class ExceptionTest49 {
	public static void main(String arg[]) {
		int res = Division1.div(arg);
		System.out.println("Result:" + res);
	}
}