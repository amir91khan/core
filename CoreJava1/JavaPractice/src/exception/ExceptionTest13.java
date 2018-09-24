package exception;

public class ExceptionTest13 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in outer try");
			try
			{
				System.out.println("in inner try");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("in inner catch");
			}
			System.out.println("after inner tyr/catch");
		}
		catch(ArithmeticException k)
		{
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");

	}

}
