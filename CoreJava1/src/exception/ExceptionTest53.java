package exception;

import java.util.*;

class LoginException extends Exception {
	LoginException(String msg) {
		super(msg);
	}
}

public class ExceptionTest53 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input username");
		String uname = scan.next();
		System.out.println("input password");
		String pwd = scan.next();
		try {
			if (uname.equals("nit") && pwd.equals("nit123"))
				System.out.println("welcome to my application");
			else
				throw new LoginException("invalid username or password");
		} catch (LoginException e) {
			System.out.println(e.getMessage());

		}

	}

}
