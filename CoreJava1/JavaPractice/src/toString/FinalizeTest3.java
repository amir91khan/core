package toString;

import java.util.*;

class Employee1 {
	private int empno;
	private String name;
	Scanner scan = new Scanner(System.in);

	void read() {
		System.out.println("input empno");
		empno = scan.nextInt();
		System.out.println("inpur name");
		name = scan.next();
	}

	void print() {
		System.out.printf("\n Employee No %d", empno);
		System.out.printf("\n Employee Name %s", name);
	}

}

class SalariedEmployee1 extends Employee1 {
	private float salary;

	void read() {
		super.read();
		System.out.println("input salary");
		salary = scan.nextFloat();
	}

	void print() {
		super.print();
		System.out.printf("\n Salary is %f", salary);
	}
}

public class FinalizeTest3 {

	public static void main(String[] args) {
		SalariedEmployee1 se = new SalariedEmployee1();
		se.read();
		se.print();

	}

}
