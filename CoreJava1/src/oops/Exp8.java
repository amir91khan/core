package oops;

class Tes{
	static int div(String[] args)
	{

	
		int res=-1;
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			res=5;
		}
		catch(NumberFormatException e)
		{
			res=6;
		}
		catch(ArithmeticException e)
		{
			res=7;
		}
		System.out.println("after try/catch");
		return res;
	}

}
public class Exp8 {
	public static void main(String[] args) {
		int res=Tes.div(args);
		System.out.println("Result:"+res);
}
}