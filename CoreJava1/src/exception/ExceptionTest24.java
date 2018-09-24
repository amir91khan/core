package exception;

public class ExceptionTest24 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("after try/finally");

	}

}
