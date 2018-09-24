package oops;

public class Exception4 {

	public static void main(String[] args) {
		
	try {
			System.out.println("outer try");
			
			
			try {
				System.out.println("inner try");
				System.out.println(10/0);
			} 
			catch (ArithmeticException e) {
				
				System.out.println("inner catch");
				System.out.println(10/0);
			}
			System.out.println("after inner try/catch");
		} 
		catch (NumberFormatException e) {
			
			System.out.println("outer catch");

		}
		System.out.println("after outer try/catch");

	}
}
