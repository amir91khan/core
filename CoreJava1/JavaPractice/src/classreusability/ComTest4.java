package classreusability;

import java.util.*;

class Address1 {
	private String street;
	private String city;

	void readAddress1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input street");
		street = scan.next();
		System.out.println("input city");
		city = scan.next();
	}

	void printAddress1() {
		System.out.println(street);
		System.out.println(city);
	}
}

class Man {
	private String name;
	Address1 add1 = new Address1();
	Address1 add2 = new Address1();

	void readName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input name");
		name = scan.next();
	}

	void printName() {
		System.out.println(name);

	}
}

public class ComTest4 {

	public static void main(String[] args) {
		Man m = new Man();
		m.readName();
		m.add1.readAddress1();
		m.add2.readAddress1();
		m.printName();
		m.add1.printAddress1();
		m.add2.printAddress1();
	}

}
