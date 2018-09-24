package exception;

public class ExceptionTest41 {

	public static void main(String[] args) {
		System.out.println(m1());

	}
	static int m1()
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
				return 10;
			}
			
		}
		catch(NullPointerException k)
		{
			System.out.println("outer catch");
		}
		finally
		{
			System.out.println("outer finally");
			return 30;
		}
	}

}
