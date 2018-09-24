package exception;

import java.io.*;

public class Division {
	public static void div() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a;
			while (true) {
				try {
					System.out.println("\n Enter first Numbe:r");
					a = Integer.parseInt(br.readLine());
					break;
				} catch (NumberFormatException nfe) {
					System.out.println("Enter only Integer");
				}
			}
			while (true) {
				try {
					System.out.println("\n Enter Second Number:");
					int b = Integer.parseInt(br.readLine());
					try {
						int c = a / b;
						System.out.println("Result:" + c);
						break;
					} catch (ArithmeticException ae) {
						System.out.println("Don't pass Zero");
					}
				} catch (NumberFormatException nfe) {
					System.out.println("Enter only integer");
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		div();
	}
}
