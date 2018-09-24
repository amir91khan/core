package array;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input how many elements");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("input elements of array");
		for (int i = 0; i < a.length; i++)
			a[i] = scan.nextInt();
		int sum = 0;

		for (int e : a)
			sum = sum + e;
		System.out.println("sum is" + sum);

	}

}
