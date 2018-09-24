package exception;

public class ExceptionTest6 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try 1");
		}
		catch(Exception e)
		{
			System.out.println("in catch 1");
		}
		System.out.println("after try/catch 1");
		try
		{
			System.out.println("in try 2");
		}
		catch(Exception e)
		{
			System.out.println("in catch 2");
		}
		System.out.println("after try/catch 2");
		
		

	}

}
