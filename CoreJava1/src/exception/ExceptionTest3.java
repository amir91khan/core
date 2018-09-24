package exception;
import java.util.Scanner;
public class ExceptionTest3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		try
		{
			int n3=n1/n2;
			System.out.println(n3);
			
		}
		catch(ArithmeticException x)
		{
			System.out.println("can not divide number with zero");
		}
		

	}

}
