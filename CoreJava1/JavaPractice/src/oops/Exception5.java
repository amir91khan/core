package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Division {
	public static void div() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a;
			while (true) {
				try {
					System.out.println("\n Enter first number");
					a = Integer.parseInt(br.readLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Enter only integer");
				}
			}
			while (true) {
				try {
					System.out.println("\n Enter second number");
					int b = Integer.parseInt(br.readLine());
					try {
						int c = a / b;
						System.out.println("Result:" + c);

						break;
					} catch (ArithmeticException e) {
						System.out.println("Donn't pass zero");
					}
				} catch (NumberFormatException e) {
					System.out.println("Enter only integer");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class Exception5 {

	public static void main(String[] args) {
		Division.div();

	}

}
