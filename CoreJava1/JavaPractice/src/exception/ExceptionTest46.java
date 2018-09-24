package exception;

public class ExceptionTest46 {

	public static void main(String[] args) {

		int a;
		try {
			a = 10;
			//System.out.println(a);
			
		} catch (ArithmeticException e) {
			a = 20;
		}
		finally
		{
			a=30;
		}
		
		System.out.println(a);
		
	}
	}
	
