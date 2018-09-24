package string;
import java.util.*;
public class EqualsTest1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input username");
	String	user=scan.next();
	System.out.println("input password");
	String pwd=scan.next();
	if(user.equals("nit")&&pwd.equals("nit123"))
		System.out.println("welcome to my App");
	else
		System.out.println("invalid username or password");
		

	}

}
