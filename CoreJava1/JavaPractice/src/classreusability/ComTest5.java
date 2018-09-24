package classreusability;

import java.util.*;

class DateTest {
	private int dd, mm, yy;

	void readDate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input date");
		dd = scan.nextInt();
		mm = scan.nextInt();
		yy = scan.nextInt();
	}

	void printDate() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}
}

class Employee {
	private String name;
	DateTest dob = new DateTest();
	DateTest doj = new DateTest();

	void readName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input name");
		name = scan.next();
	}

	void printName() {
		System.out.println(name);
	}
}

public class ComTest5 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.readName();
		emp.dob.readDate();
		emp.doj.readDate();
		emp.printName();
		emp.dob.printDate();
		emp.doj.printDate();

	}

}
