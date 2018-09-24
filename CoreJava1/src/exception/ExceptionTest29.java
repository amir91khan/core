package exception;

public class ExceptionTest29 {

	public static void main(String[] args) {
		try
		{
			int n=Integer.parseInt(args[0]);
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
