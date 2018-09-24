package oops;

public class ExceptionHandlingTest {
	public static void main(String[] args) {
		System.out.println(Divide());

	}

	public static int Divide() {
		try {
			System.out.println(10 / 0);
			return 777;
		}
		/*
		 * catch(ArithmeticException ae) { return 888; } catch( Exception e) { return
		 * 444; }
		 */
		catch (ArithmeticException | NullPointerException ne) {
			return 888;

		}

	}
}
