package typeconversion;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input any number");
		int num = scan.nextInt();
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;

		}
		System.out.println("sum is" + sum);

	}

}
