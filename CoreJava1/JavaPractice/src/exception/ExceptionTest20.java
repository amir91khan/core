package exception;

public class ExceptionTest20 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");

	}

}
