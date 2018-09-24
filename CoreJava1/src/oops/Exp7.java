package oops;

public class Exp7 {

	public static void main(String[] args) {
		int a=-1;
		try
		{
			a=10;
			System.out.println("try:"+a);
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			a=20;
			System.out.println("catch:"+a);
		}
		finally
		{
			System.out.println("finally:"+a);
		}
	}

}
