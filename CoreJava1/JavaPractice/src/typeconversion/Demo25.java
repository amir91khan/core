package typeconversion;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("input 3 integers");
		int i;
		for (i = 0; i < 3; i++)
			a[i] = scan.nextInt();
		System.out.println("integers are");
		for (i = 0; i < 3; i++)
			System.out.println(a[i]);

	}

}
