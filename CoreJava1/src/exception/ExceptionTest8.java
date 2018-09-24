package exception;

public class ExceptionTest8 {

	public static void main(String[] args) {
	try
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("Result:"+(a+b));
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Results:"+(4+5));
	}
	catch(NumberFormatException k)
	{
		System.out.println("Result:"+(6+7));
	}
	catch(ArithmeticException x)
	{
		System.out.println("Results:"+(8+9));
	}

	}

}
