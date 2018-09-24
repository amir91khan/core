package typeconversion;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inout any no");
		int num = scan.nextInt();
		System.out.println("1.EvenNo");
		System.out.println("2.OddNo");
		System.out.println("3.Exit");
		System.out.println("input any option");
		int opt = scan.nextInt();
		switch (opt) {
		case 1:
			if (num % 2 == 0)
				System.out.println("EvenNo");
			else
				System.out.println("OddNo");
			break;
		case 2:
			if (num % 2 != 0)
				System.out.println("OddNo");
			else
				System.out.println("Not OddNo");
			break;
		default:
			System.out.println("Invalid option");
		}
	}
}
