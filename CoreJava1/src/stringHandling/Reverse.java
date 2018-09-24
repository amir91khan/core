package stringHandling;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=scan.nextLine();
		String result=StringWordsReverse.reverseStringWords(str);
		System.out.println("original String:"+str);
		System.out.println("reverse String:"+result);
		

	}

}
