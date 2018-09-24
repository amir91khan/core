package exception;

public class ExceptionTest43 {

	public static void main(String[] args) {
		System.out.println(m1());
	//	m1();

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
				System.out.println("inner outer");
			}
			finally
			{
				System.out.println("inner finally");
			///	return 30;
			}

		}
		catch(NullPointerException k)
		{
			System.out.println("outer catch");
		}
		finally
		{
			System.out.println("outer finally");
			//return 40;
		}
		//System.out.println("after outer try/catch/finally");
		return 40;
	}

}
