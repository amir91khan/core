package polymorphism;

import java.util.*;

class Employee {
	private String name;
	Scanner scan = new Scanner(System.in);

	void read() {
		System.out.println("input name");
		name = scan.next();
	}

	void print() {
		System.out.println("Name is" + name);
	}

}

class SalariedEmployee extends Employee {
	private float salary;

	void read() {
		super.read();
		System.out.println("input salary");
		salary = scan.nextFloat();

	}

	void print() {
		super.print();
		System.out.println("Salary is" + salary);
	}
}

class Worker extends Employee {
	private float wage;

	void read() {
		super.read();
		System.out.println("input wage");
		wage = scan.nextFloat();
	}

	void print() {
		super.print();
		System.out.println("Wage is" + wage);
	}
}

class Printer {
	static void print(Employee e) {
		e.print();
	}
}

public class PolymorTest1 {

	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee();
		se.read();
		Worker w = new Worker();
		w.read();
		Printer.print(se);
		Printer.print(w);

	}

}
