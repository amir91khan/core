package stringHandling;
import java.util.*;
public class StringLength1 {

	public static void main(String[] args) {
		String s1=" ";
		String s2=" ";
		String s3="ab";
		String s4=new String();
		String s5=new String("");
		String s6=new String("");
		String s7=new String("ab");
		System.out.println("s1 length:"+s1.length());
		System.out.println("s2 length:"+s2.length());
		System.out.println("s3 length:"+s3.length());
		System.out.println("s4 length:"+s4.length());
		System.out.println("s5 length:"+s5.length());
		System.out.println("s6 length:"+s6.length());
		System.out.println("s7 length:"+s7.length());
	//	String s8=null;
	//	System.out.println("s8 length:"+s8.length());
		String s9="null";
		System.out.println("s9 length:"+s9.length());
		Scanner scan=new Scanner(System.in);
		String s10="null";
		System.out.println("s10 length:"+s10.isEmpty());
		System.out.println();
		System.out.println("Enter String s1");
		System.out.println(scan.nextLine().length());
		System.out.println(" Enter String s2");
		System.out.println(scan.nextLine().length());
		System.out.println(" Enter String s3");
		System.out.println(scan.nextLine().length());

	}

}
