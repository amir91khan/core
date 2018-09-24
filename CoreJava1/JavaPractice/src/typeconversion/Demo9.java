package typeconversion;

import java.util.*;

public class Demo9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input three no");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is max");
		} else {
			if (n2 > n3) {
				System.out.println("n2 is max");
			} else {
				System.out.println("n3 is max");
			}
		}

	}

}
