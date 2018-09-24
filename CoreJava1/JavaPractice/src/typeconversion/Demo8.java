package typeconversion;

import java.util.*;

public class Demo8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input any number");
		int number = scan.nextInt();
		if (number % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
