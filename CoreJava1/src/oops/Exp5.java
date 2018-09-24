package oops;

public class Exp5 {

	public static void main(String[] args) {
		//m1();
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
				System.out.println(10/0);
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
		catch(ArithmeticException e)
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
