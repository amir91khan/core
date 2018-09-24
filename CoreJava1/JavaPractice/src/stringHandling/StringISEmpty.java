package stringHandling;

import java.util.*;

public class StringISEmpty {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String("");
		String s7 = new String("a");
		System.out.println("s1 empty:" + s1.isEmpty());
		System.out.println("s2 empty:" + s2.isEmpty());
		System.out.println("s3 empty:" + s3.isEmpty());
		System.out.println("s4 empty:" + s4.isEmpty());
		System.out.println("s5 empty:" + s5.isEmpty());
		System.out.println("s6 empty:" + s6.isEmpty());
		System.out.println("s7 empty:" + s7.isEmpty());
		//String s8 = null;
		//System.out.println("s8 empty:" + s8.isEmpty());
		String s9 = "null";
		System.out.println("s9 empty:" + s9.isEmpty());
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter String1:");
		System.out.println(scan.nextLine().isEmpty());
		System.out.println("\n Enter String2:");
		System.out.println(scan.nextLine().isEmpty());
		System.out.println("\n Enter String3:");
		System.out.println(scan.nextLine().isEmpty());

	}

}
