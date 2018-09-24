package exception;

public class ExceptionTest30 {

	public static void main(String[] args) {
		try
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int z=x/y;
			System.out.println(z);
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid type of orguments");
		}
		catch(Exception k)
		{
			System.out.println(k);
		}

	}

}
