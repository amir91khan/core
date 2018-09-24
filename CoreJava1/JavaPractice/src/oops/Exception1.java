package oops;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	public static int m1() {
		try
		{
			System.exit(0);
			System.out.println("try executed");
			
			System.out.println(10/0);
			return 777;
		}
		catch(ArithmeticException e)
		{
			return 888;
			//System.out.println("catch executed");
		}
		finally
		{
			return 999;
			//System.out.println("finally executed");
		}
	}

}
