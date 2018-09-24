package typeconversion;
import java.util.*;
public class Demo11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input any character");
		String str=scan.next();
		char ch=str.charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			System.out.println("Alphabet");
		else
			if(ch=='0'&&ch<='9')
				System.out.println("Digit");
			else
				System.out.println("Special Character");
	}

}
