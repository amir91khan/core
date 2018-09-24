package typeconversion;
import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input any cahareacter");
		String str=scan.next();
		char ch=str.charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		
			System.out.println("vowel");
		else
			System.out.println("not vowel");

	}

}
