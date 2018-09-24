package oops;

public class Exp1 {

	public static void main(String[] args) {
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("results:"+c);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("result:"+(4+5));
		}
		catch(NumberFormatException n)
		{
			System.out.println("result:"+(6+7));
		}
		catch(ArithmeticException e)
		{
			System.out.println("results:"+(7+8));
		}

	}

}
