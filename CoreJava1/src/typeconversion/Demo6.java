package typeconversion;

import java.util.*;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input year");
		int year = scan.nextInt();
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)

			System.out.println("leap year");
		else
			System.out.println("not leap year");
	}

}
