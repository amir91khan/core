package exception;

public class ExceptionTest9 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
         System.out.println("getMessage()method output");
         System.out.println(e.getMessage());
         System.out.println("=========\n");
         System.out.println("toString()methos output");
         System.out.println(e.toString());
         System.out.println("=======\n");
         System.out.println("printStackTrace()method output");
         e.printStackTrace();
         System.out.println("==============\n");
         System.out.println("JVM default output");
         throw e;
	}
	}
}
