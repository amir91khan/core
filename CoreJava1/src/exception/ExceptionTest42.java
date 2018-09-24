package exception;

public class ExceptionTest42 {

	public static void main(String[] args) {
	m1();
	//System.out.println("saass");
	}
	static void m1()
	{
		try
		{
			System.out.println("outer try");
		
		try
		{
			System.out.println("inner try");
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("inner catch");
		}
		finally
		{
			System.out.println("inner finally");
		}
		System.out.println("after inner try/catch/fiannly");
	}
	catch(NullPointerException k)
	{
		System.out.println("outer catch");
	}
	finally
	{
		System.out.println("outer finally");
		//return;
		
	}
	System.out.println("after outer try/catch/finally");
	}
}
