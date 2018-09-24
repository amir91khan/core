package exception;
import java.util.Scanner;
public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input two numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=n1/n2;
		System.out.println(n3);
		
	}

}
