package exception;

public class ExceptionTest32 {

	public static void main(String[] args) {
		System.out.println(m1());

	}
	static int m1()
	{
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
		
			return ;
		}
	}

}
