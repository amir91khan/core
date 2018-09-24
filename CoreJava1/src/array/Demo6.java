package array;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input how many names");
		int n = scan.nextInt();
		String name[] = new String[n];
		System.out.println("input name");
		for (int i = 0; i < name.length; i++)
			name[i] = scan.next();
		for (String s : name)
			System.out.println(s);

	}

}
