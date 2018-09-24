package exception;

public class ExceptionTest7 {

	public static void main(String[] args) {
		try
		{
			int n1=Integer.parseInt(args[0]);
		  System.out.println(n1);
		}
		catch(ArrayIndexOutOfBoundsException|NumberFormatException e)
		{
			System.out.println("invalid or number of argumnets");
		}
	}

}
