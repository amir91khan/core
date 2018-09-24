package exception;

public class ExceptionTest45 {
//static int a,b;
	public static void main(String[] args) {
		int a=10;
		int b=20;
		try
		{
		//	int b=20;
			System.out.println(a);
			System.out.println(b);
			//System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			a=30;
			b=40;
		}
		System.out.println(a);
		System.out.println(b);

	}

}
