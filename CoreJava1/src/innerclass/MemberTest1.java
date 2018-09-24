package innerclass;

import java.util.Scanner;

class Person {
	private String name;
	Scanner scan = new Scanner(System.in);

	void readName() {
		System.out.println("input name");

		name = scan.next();
	}

	void printName() {
		System.out.println("Name is" + name);
	}

	class Address {
		private String city, street;

		void readAddress() {
			System.out.println("input city");
			city = scan.next();
			System.out.println("input street");
			street = scan.next();
		}

		void printAddress() {
			System.out.println(city);
			System.out.println(street);
		}
	}

	Address add1 = new Address();
	Address add2 = new Address();

}

public class MemberTest1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.readName();
		p1.add1.readAddress();
		p1.add2.readAddress();
		p1.printName();
		p1.add1.printAddress();
		p1.add2.printAddress();

	}

}
