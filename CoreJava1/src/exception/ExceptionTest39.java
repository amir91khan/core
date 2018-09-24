package exception;

public class ExceptionTest39 {

	public static void main(String[] args) {
		m1();
	}
	static void m1()
	{
		try
		{
			System.out.println("outer try");
			try
			{
				System.out.println("inner try");
			}
			catch(NullPointerException e)
			{
				System.out.println("inner catch");
			}
			finally
			{
				System.out.println("inner finally");
			}
			System.out.println("after inner try/catch/finally");
		
			}
		catch(NullPointerException k)
		{
			System.out.println("outer catch");
		}
		finally
		{
		System.out.println("outer finally");

	}
	System.out.println("after outer try/catch/finally");
	}
}
