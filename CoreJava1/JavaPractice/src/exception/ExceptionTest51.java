package exception;

public class ExceptionTest51 {

	public static void main(String[] args) {
		System.out.println("main method start");
		m1();
		System.out.println("main method end");

	}
	static void m1()
	{
		System.out.println("m1 method start");
		System.out.println(10/0);
		System.out.println("m1 method end");
	}

}
