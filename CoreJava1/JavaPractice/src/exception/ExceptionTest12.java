package exception;

public class ExceptionTest12 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in outer try");
			System.out.println(10/0);
			try
			{
				System.out.println("in inner try");
			}
			catch(ArithmeticException e)
			{
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}
		catch(ArithmeticException k)
		{
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");

	}

}
