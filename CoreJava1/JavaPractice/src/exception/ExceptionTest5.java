package exception;
import java.util.Scanner;
public class ExceptionTest5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			int a = Integer.parseInt(args[0]);
			a=scan.nextInt();
			int b = Integer.parseInt(args[1]);
			b=scan.nextInt();
			int c = a / b;
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("please pass atleast two integer values");
		} catch (NumberFormatException nfe) {
			System.out.println("please pass only two integer values");
		} catch (ArithmeticException ae) {
			System.out.println("please don't pass second value as Zero");
		}

	}

}