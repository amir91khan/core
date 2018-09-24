package exception;

public class ExceptionTest48 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try");
			return 10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch");
			return 20;
		}

	}

}
