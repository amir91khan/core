package exception;

public class ExceptionTest47 {

	public static void main(String[] args) {
		int a=-1;
		try
		{
			a=10;
			System.out.println("in try a:"+a);
		}
		catch(ArithmeticException e)
		{
			a=20;
			System.out.println("in catch a:"+a);
		}
		finally
		{
			System.out.println("in try a:"+a);
		}
		System.out.println("after try/catch/finally a:"+a);

	}

}
