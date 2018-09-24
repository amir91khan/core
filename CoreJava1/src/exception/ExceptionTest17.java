package exception;

public class ExceptionTest17 {

	public static void main(String[] args) {
		try
		{
			System.out.println("inside try block");
			int x=Integer.parseInt(args[0]);
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally bloack");
		}
		System.out.println("continue........");

	}

}
